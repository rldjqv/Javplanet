var boardDetailVue = new Vue ({
	el : "#vue_board_detail",
	data : {
		category : 'board_detail',
		url : location.origin + "/api",
		boardDetailParam : {
			category : "",
			seq : "",
			searchText : ""
		},
		resultDatas : {},
		isReplyOpen : true,
		reply : ""
		
	},
	created : function () {
		this.boardDetailParam.seq = commonVue.queryString.seq;
		this.boardDetailParam.searchText = decodeURI(commonVue.queryString.searchText);
		
		axios({
			method: 'get',
			url: this.url + "/board/detail/",
			params : this.boardDetailParam
		})
		.then(function (response) {
			this.resultDatas = response.data;
			setTimeout(() => {
	    		commonVue.setMeta(this.resultDatas.data.title);	
			}, 100);
		}.bind(this))
		.catch(function(e) {
		});
	},
	mounted : function () {

	},
	methods : {
		getHistoryBack : function () {
			window.location.href = "/board?searchText=" + commonVue.queryString.searchText + "&currentPage=" + commonVue.queryString.currentPage;
		},
		getPreviousPage : function () {
			window.location.href = "/board/detail?seq=" + this.resultDatas.data.previousSeq + "&searchText=" + commonVue.queryString.searchText + "&currentPage=" + commonVue.queryString.currentPage;
		},
		getNextPage : function () {
			window.location.href = "/board/detail?seq=" + this.resultDatas.data.nextSeq + "&searchText=" + commonVue.queryString.searchText + "&currentPage=" + commonVue.queryString.currentPage;
		},
		putUp : function (seq) {
			axios
		    .put(this.url + "/board/detail/up/" + commonVue.queryString.seq)
		    .then(function(response){
		    	this.resultDatas.data.up += 1;
		    }.bind(this))
		    .catch(function(e) {
		    });	
		},
		putDown : function (seq) {
			axios
		    .put(this.url + "/board/detail/down/" + commonVue.queryString.seq)
		    .then(function(response){
		    	this.resultDatas.data.down += 1;
		    }.bind(this))
		    .catch(function(e) {
		    });	
		},
		openReply : function () {
			this.isReplyOpen == false ? this.isReplyOpen = true : this.isReplyOpen = false;
		},
		postReply : function (seq) {
			this.reply;
			alert("댓글쓰기 기능은 준비중입니다.");
		}
		
	},
	
	computed : function () {
		
	},
	watch : {
		
	}
});
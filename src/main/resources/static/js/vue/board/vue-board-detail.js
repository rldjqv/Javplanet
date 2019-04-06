var boardDetailVue = new Vue ({
	el : "#vue_board_detail",
	data : {
		category : 'board_detail',
		url : location.origin + "/api",
		boardDetailParam : {
			category : "",
			seq : ""
		},
		resultDatas : {},
		isReplyOpen : false,
		reply : ""
		
	},
	created : function () {

	},
	mounted : function () {
		axios
	    .get(this.url + "/board/detail/" + commonVue.queryString.seq)
	    .then(function(response){
	    	this.resultDatas = response.data;
	    	commonVue.setTitle(this.resultDatas.data.title);
	    }.bind(this))
	    .catch(function(e) {
	    	alert("잘못된 접근입니다.");
	    	history.back();
	    });	
	},
	methods : {
		getHistoryBack : function () {
			window.location.href = "/board?currentPage=" + localStorage.currentPage;
		},
		getPreviousPage : function () {
			window.location.href = "/board/detail?seq=" + this.resultDatas.data.previousSeq;
		},
		getNextPage : function () {
			window.location.href = "/board/detail?seq=" + this.resultDatas.data.nextSeq;
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
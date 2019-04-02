var boardDetailVue = new Vue ({
	el : "#vue_board_detail",
	data : {
		category : 'board_detail',
		url : location.origin + "/api",
		boardDetailParam : {
			category : "",
			seq : ""
		},
		resultDatas : {}
		
	},
	created : function () {
//		var queryString = (window.location.href).split("?")[1];
//		var seq = queryString.split('=')[1];
//		this.boardDetailParam.seq = seq;

	},
	mounted : function () {
		axios
	    .get(this.url + "/board/detail/" + commonVue.queryString.seq)
	    .then(function(response){
	    	this.resultDatas = response.data;
	    	commonVue.setTitle(this.resultDatas.data.title);
	    }.bind(this))
	    .catch(function(e) {
	    });	
	},
	methods : {
		getHistoryBack : function () {
			history.back();
		},
		getPreviousPage : function () {
			window.location.href = "/board/detail?seq=" + this.resultDatas.data.previousSeq;
		},
		getNextPage : function () {
			window.location.href = "/board/detail?seq=" + this.resultDatas.data.nextSeq;
		},
		postUp : function (seq) {
			alert("추천하기 기능은 준비중입니다.");
		},
		postDown : function (seq) {
			alert("비추천하기 기능은 준비중입니다.");
		},
		postReply : function (seq) {
			alert("댓글달기 기능은 준비중입니다.");
		}
		
	},
	
	computed : function () {
		
	},
	watch : {
		
	}
});
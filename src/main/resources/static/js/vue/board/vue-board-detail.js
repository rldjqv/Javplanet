var boardDetailJs = new Vue ({
	el : "#vue_board_detail",
	data : {
		category : 'board_detail',
		resultDatas : {},
		url : location.origin + "/api"
	},
	created : function () {

	},
	mounted : function () {
//		axios
//	    .get(this.url + "/board/detail/" + boardJs.boardParam.seq)
//	    .then(function(response){
//	    	debugger;
//	    	this.resultDatas = response.data;
//	    }.bind(this))
//	    .catch(function(e) {
//	    });	
	},
	methods : {
	},
	
	computed : function () {
		
	},
	watch : {
		
	}
});
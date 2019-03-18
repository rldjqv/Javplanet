var boardDetailJs = new Vue ({
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
		var queryString = (window.location.href).split("?")[1];
		var seq = queryString.split('=')[1];
		this.boardDetailParam.seq = seq;

	},
	mounted : function () {
		axios
	    .get(this.url + "/board/detail/" + this.boardDetailParam.seq)
	    .then(function(response){
	    	this.resultDatas = response.data;
	    }.bind(this))
	    .catch(function(e) {
	    });	
	},
	methods : {
	},
	
	computed : function () {
		
	},
	watch : {
		
	}
});
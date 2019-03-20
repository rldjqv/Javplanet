var boardJs = new Vue ({
	el : "#vue_board",
	data : {
		category : 'board',
		resultDatas : {},
		url : location.origin + "/api",
		boardParam : {
			seq : ''
		}
	},
	created : function () {
		commonJs.naverAnalytics();
	},
	mounted : function () {
		axios
	    .get(this.url + "/board")
	    .then(function(response){
	    	this.resultDatas = response.data;
	    }.bind(this))
	    .catch(function(e) {
	    });
	},
	methods : {
		getBoardDetail : function (seq) {
			window.location.href = "/board/detail?seq=" + seq;
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});
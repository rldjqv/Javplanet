var boardJs = new Vue ({
	el : "#vue_board",
	data : {
		category : 'board',
		resultDatas : {},
		url : location.origin + "/api/board"
	},
	created : function () {

	},
	mounted : function () {
		axios
	    .get(this.url)
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
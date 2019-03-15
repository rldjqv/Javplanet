var boardJs = new Vue ({
	el : "#vue_board",
	data : {
		category : 'board',
		resultDatas : {},
		url : location.origin + "/api/board"
	},
	created : function () {
		axios
	    .get(this.url)
	    .then(function(response){
	    	debugger;
	    	this.resultDatas = response.data;
//	    	window.location.href = "/" + this.category;
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
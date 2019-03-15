var contentsJs = new Vue ({
	el : "#vue_contents",
	data : {
		resultDatas : {},
		url : location.origin + "/api/upload",
		uploadParam : {
			category : "",
			title : "",
			contents : "",
			images : []
		}

	},
	created : function () {
		
	},
	mounted : function () {

	},
	methods : {
		uploadConents : function () {
			var queryString = (window.location.href).split("?")[1];
			var category = queryString.split('=')[1];
			this.uploadParam.category = category;
			
			axios
		    .post(this.url + "/contents", this.uploadParam)
		    .then(function(response){
		    	window.location.href = "/" + category;
		    }.bind(this))
		    .catch(function(e) {
		    });
		}
	},
	computed : function () {

	},
	watch : {

	}
});
var contentsJs = new Vue ({
//	el : "#vue_contents",
	data : {
		resultDatas : {},
		url : location.origin + "/api/contents",
		category : "",
		title : "",
		contents : "",
		images : []
	},
	created : function () {
		var queryString = (window.location.href).split("?")[1];
		var params = queryString[1].split('=');
		this.category = queryString.split("=")[1];
	},
	methods : {

	},
	computed : function () {
		
	},
	watch : {
		
	}
});
var indexJs = new Vue ({
	el : "#vue_index",
	data : {
		resultDatas : {},
		url : location.origin + "/api/index"
	},
	created : function () {
		commonJs.naverAnalytics();
	},
	mounted : function () {
		
	},
	methods : {

	},
	computed : function () {
		
	},
	watch : {
		
	}
});
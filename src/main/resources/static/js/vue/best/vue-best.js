var bestJs = new Vue ({
	el : "#vue_best",
	data : {
		name : 'best',
		resultDatas : {},
		url : location.origin + "/api/best"
	},
	created : function () {
		debugger;
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
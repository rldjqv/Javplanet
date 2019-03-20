var sportsJs = new Vue ({
	el : "#vue_sports",
	data : {
		resultDatas : {},
		url : location.origin + "/api/sports"
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
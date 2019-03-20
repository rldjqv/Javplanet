var loginJs = new Vue ({
	el : "#vue_login",
	data : {
		resultDatas : {},
		url : location.origin + "/api/user/login"
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
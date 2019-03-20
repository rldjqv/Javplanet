var gameJs = new Vue ({
	el : "#vue_game",
	data : {
		resultDatas : {},
		url : location.origin + "/api/game"
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
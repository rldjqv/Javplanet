var commonJs = new Vue ({
	data : {
		isMobile : false
	},
	created : function () {
		var filter = "win16|win32|win64|mac|macintel";
		if (navigator.platform) {
			if (filter.indexOf(navigator.platform.toLowerCase()) < 0) {
				this.isMobile = true;
			} else {
				this.isMobile = false;
			}
		}
	},
	mounted : function () {
		
	},
	methods : {
		uploadContents : function (category) {
			window.location.href = "/upload/contents?category=" + category;
		},
		
		uploadBoard : function () {
			window.location.href = "/upload/contents?category=" + category;
		},
		naverAnalytics : function () {
			if(!wcs_add) var wcs_add = {};
			wcs_add["wa"] = "dd9cdf64921808";
			wcs_do();			
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});
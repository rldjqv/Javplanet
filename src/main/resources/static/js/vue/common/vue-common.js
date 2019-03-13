var commonJs = new Vue ({
	data : {
		isMobile : true
	},
	created : function () {
		var filter = "win16|win32|win64|mac|macintel";
		if (navigator.platform) {
			if (filter.indexOf( navigator.platform.toLowerCase()) < 0 ) {
				this.isMobile = true;
			} else {
				this.isMobile = false;
			}
		}
	},
	methods : {
		uploadsContents : function (category) {
			window.location.href = "/uploads/contents?category=" + category;
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});
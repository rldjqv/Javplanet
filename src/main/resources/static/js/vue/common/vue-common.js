var commonJs = new Vue ({
	data : {
		isLogin : false,
		isMobile : false,
		offset : 0,
		queryString : {}
	},
	created : function () {
		// QueryString 초기화 //
		var params = {};
	    window.location.search.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(str, key, value) { params[key] = value; });
	    this.queryString = params;
		// QueryString 초기화 //
	    
		// 모바일 접근 유무 //
		var filter = "win16|win32|win64|mac|macintel";
		if (navigator.platform) {
			if (filter.indexOf(navigator.platform.toLowerCase()) < 0) {
				this.isMobile = true;
			} else {
				this.isMobile = false;
			}
		}
		// 모바일 접근 유무 //
	},
	mounted : function () {
		
	},
	methods : {
		uploadContents : function (category) {
			window.location.href = "/upload/contents?category=" + category;
		},
		setTitle : function (title) {
			document.title = title;
			document.getElementById('meta_title').setAttribute('content', title);
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});

Vue.component('pagination', {
	props: ['total_cnt'],
	template:
    '<nav class="pagination">' +
    '<ul>' + 
	  '<li><a href="#">&laquo;</a></li>' +
	  '<li :class="{\'current\' : (currentPage == pageIndex)}" v-for="pageIndex in totalPage"><a @click="getSelectPage(pageIndex)">{{getPageIndex(pageIndex)}}</a></li>' +
	  '<li><a href="#">&raquo;</a></li>' +
	'</ul>' +
	'</nav>',
	data : function () {
		return {
			totalPage : Math.ceil(this.total_cnt / 20),
			currentPage : commonJs.queryString.currentPage
			}
	},
	created : function () {

	},
	mounted : function () {
		
	},
	methods : {
		getPageIndex : function(pageIndex) {
			return pageIndex;
		},
		getSelectPage : function(pageIndex) {
			this.currentPage = pageIndex;
//			commonJs.offset = (pageIndex -1) * 20;
//			this.$parent.search();
			window.location.href="?currentPage=" + this.currentPage;
		}

	},
	computed : {
		isActive : function () {
			return {
				
			}
		}
	},
	watch : {
		
	}
});
var commonJs = new Vue ({
	data : {
		isMobile : false,
		member : {
			id : '',
			name : '',
		},
		offset : 0
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
	props: ['category', 'total_cnt'],
	template:
    '<nav class="pagination">' +
    '<ul>' + 
	  '<li><a href="#">&laquo;</a></li>' +
	  '<li :class="{\'current\' : (currentPage == pageIndex)}" v-for="pageIndex in totalPage"><a @click="getSelectPage(pageIndex)">{{getPageIndex(pageIndex)}}</a></li>' +
	  '<li><a href="#">&raquo;</a></li>' +
	  '<a class="contents_write" v-if="commonJs.isMobile == false" v-on:click="commonJs.uploadContents(category)">글쓰기</a>' +
	'</ul>' +
	'</nav>',
	data : function () {
		return {
			totalPage : Math.ceil(this.total_cnt / 20),
			currentPage : 1
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
			commonJs.offset = (pageIndex -1) * 20;
			this.$parent.search();
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
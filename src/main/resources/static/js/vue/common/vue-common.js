var commonVue = new Vue ({
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
    '<nav class="pagination" v-if="this.isMounted" v-cloak>' +
    '<ul>' + 
	  '<li v-if="getIsPreviousBlockActive()"><a @click="getPreviousBlock()">&laquo;</a></li>' +
	  '<li v-if="getIsPreviousPageActive()"><a @click="getPreviousPage()">&lsaquo;</a></li>' +
	  '<li :class="{\'current\' : (currentPage == pageIndex)}" v-for="pageIndex in (startPage, endPage)" v-if="pageIndex >= startPage"><a @click="getSelectPage(pageIndex)">{{getPageIndex(pageIndex)}}</a></li>' +
	  '<li v-if="getIsNextPageActive()"><a @click="getNextPage()">&rsaquo;</a></li>' +
	  '<li v-if="getIsNextBlockActive()"><a @click="getNextBlock()">&raquo;</a></li>' +
	'</ul>' +
	'</nav>',
	data : function () {
		return {
			currentPage : commonVue.queryString.currentPage,
			totalPage : Math.ceil(this.total_cnt / 20),
			blockScale : 10,
			totalBlockCount : 1,
			currentBlockCount : 1,
			startPage : 1,
			endPage : 0,
			isMounted : false
			}
	},
	created : function () {
		this.totalBlockCount = Math.ceil(this.totalPage / 10);
		this.currentBlockCount = Math.floor(((this.currentPage - 1) / this.blockScale) + 1);
		this.startPage = (this.currentBlockCount - 1) * this.blockScale + 1;
		this.endPage = this.startPage + this.blockScale - 1;
		if (this.endPage > this.totalPage) {
			this.endPage = this.totalPage;
		}
	},
	mounted : function () {
		this.isMounted = true;
	},
	methods : {
		getPageIndex : function(pageIndex) {
			return pageIndex;
		},
		getSelectPage : function(pageIndex) {
			this.currentPage = pageIndex;
			window.location.href="?currentPage=" + this.currentPage;
		},
		getPreviousPage : function () {
			window.location.href="?currentPage=" + (Number(this.currentPage) - 1);
		},
		getPreviousBlock : function () {
			this.currentBlockCount = Math.floor(((this.currentPage - 1) / this.blockScale) + 1);
			this.currentBlockCount = (Number(this.currentBlockCount) - 1);
			
			this.startPage = (this.currentBlockCount - 1) * this.blockScale + 1;

			window.location.href="?currentPage=" + this.startPage;
		},
		getNextPage : function () {
			window.location.href="?currentPage=" + (Number(this.currentPage) + 1);
		},
		getNextBlock : function () {
			this.currentBlockCount = Math.floor(((this.currentPage - 1) / this.blockScale) + 1);
			this.currentBlockCount = (Number(this.currentBlockCount) + 1);
			
			this.startPage = (this.currentBlockCount - 1) * this.blockScale + 1;
			
			window.location.href="?currentPage=" + this.startPage;
		},
		getIsPreviousBlockActive : function () {
			if (this.currentBlockCount > 1) {
				return true;
			} else {
				return false;
			}
		},
		getIsPreviousPageActive : function () {
			if (this.currentPage == 1) {
				return false;
			} else {
				return true;
			}
		},
		getIsNextBlockActive : function () {
			if (this.currentBlockCount == this.totalBlockCount) {
				return false;
			} else {
				return true;
			}
		},
		getIsNextPageActive : function () {
			if (this.currentPage == this.totalPage) {
				return false;
			} else {
				return true;
			}
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
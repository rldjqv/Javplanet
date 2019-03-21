var commonJs = new Vue ({
	data : {
		category : 'test',
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
	props: ['category'],
	template: 
    '<nav class="pagination">' +
    '<ul>' + 
	  '<li><a href="#">&laquo;</a></li>' +
	  '<li><a href="#">1</a></li>' +
	  '<li><a href="#">2</a></li>' +
	  '<li><a href="#">3</a></li>' +
	  '<li><a href="#">4</a></li>' +
	  '<li class="current"><strong>5</strong></li>' +
	  '<li><a href="#">6</a></li>' +
	  '<li><a href="#">7</a></li>' +
	  '<li><a href="#">8</a></li>' +
	  '<li><a href="#">9</a></li>' +
	  '<li><a href="#">10</a></li>' +
	  '<li><a href="#">&raquo;</a></li>' +
	  '<a class="contents_write" v-if="commonJs.isMobile == false" v-on:click="commonJs.uploadContents(category)">글쓰기</a>' +
	'</ul>' +
	'</nav>'
});
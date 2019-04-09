var contentsVue = new Vue ({
	el : "#vue_contents",
	data : {
		resultDatas : {},
		url : location.origin + "/api/upload",
		uploadParam : new FormData()
	},
	created : function () {
		
	},
	mounted : function () {

	},
	methods : {
		uploadConents : function () {
			var confirm = window.confirm("게시글을 작성하시겠습니까?");
			if (!confirm) {
				return;
			}
			var category = commonVue.queryString.category;
			this.uploadParam.append('category', category);
			
			axios
		    .post(this.url + "/contents", this.uploadParam)
		    .then(function(response){
		    	window.location.href = "/"+ category +"/detail?seq=" + response.data.data.seq + "&searchText=&currentPage=1";
		    }.bind(this))
		    .catch(function(e) {
		    	alert("글 작성에 실패하였습니다. \n" + e.toString());
		    });
		}
	},
	computed : function () {

	},
	watch : {

	}
});
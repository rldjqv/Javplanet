
var contentsJs = new Vue ({
	el : "#vue_contents",
	data : {
		resultDatas : {},
		url : location.origin + "/api/upload",
		uploadParam : {
			category : "",
			title : "",
			contents : ""
		},
		images : new FormData()

	},
	created : function () {
		
	},
	mounted : function () {

	},
	methods : {
		uploadConents : function () {
			var queryString = (window.location.href).split("?")[1];
			var category = queryString.split('=')[1];
			this.uploadParam.category = category;
			
//			axios
//		    .post(this.url + "/contents", this.uploadParam)
//		    .then(function(response){
//		    	alert("글 작성에 성공하였습니다.");
//		    	window.location.href = "/"+ category +"/detail?seq=" + response.data.data.seq;
//		    }.bind(this))
//		    .catch(function(e) {
//		    	alert("글 작성에 실패하였습니다. \n" + e.toString());
//		    });

			axios
		    .post(this.url + "/files", this.images)
		    .then(function(response){
//		    	document.getElementsByTagName("img")[0].src = "dd";
		    }.bind(this))
		    .catch(function(e) {
		    });
			
		}
	},
	computed : function () {

	},
	watch : {

	}
});
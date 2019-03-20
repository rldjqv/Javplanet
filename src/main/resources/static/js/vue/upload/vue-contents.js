var contentsJs = new Vue ({
	el : "#vue_contents",
	data : {
		resultDatas : {},
		url : location.origin + "/api/upload",
		uploadParam : {
			text : {
				category : "",
				title : "",
				contents : ""				
			},
			file : {
				images : []	
			}
		}

	},
	created : function () {
		commonJs.naverAnalytics();
		
	},
	mounted : function () {

	},
	methods : {
		uploadConents : function () {
			var queryString = (window.location.href).split("?")[1];
			var category = queryString.split('=')[1];
			this.uploadParam.category = category;
			
			axios
		    .post(this.url + "/contents", this.uploadParam.text)
//		    .post(this.url + "/contents", this.uploadParam, {
//		    	headers: {
//		    		'Content-Type': 'multipart/form-data'
//		    	}
//		    })
		    .then(function(response){
		    	alert("글 작성에 성공하였습니다.");
		    	window.location.href = "/"+ category +"/detail?seq=" + response.data.data.seq;
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
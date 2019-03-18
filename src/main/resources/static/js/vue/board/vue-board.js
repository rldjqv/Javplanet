var boardJs = new Vue ({
	el : "#vue_board",
	data : {
		category : 'board',
		resultDatas : {},
		url : location.origin + "/api",
		boardParam : {
			seq : ''
		}
	},
	created : function () {
	  // Initialize Firebase
	  var config = {
	    apiKey: "AIzaSyCOAtVNdFdkNNmuGk0HJJKgbS19AbZHlMk",
	    authDomain: "kibe-26e58.firebaseapp.com",
	    databaseURL: "https://kibe-26e58.firebaseio.com",
	    projectId: "kibe-26e58",
	    storageBucket: "",
	    messagingSenderId: "195081640198"
	  };
	  firebase.initializeApp(config);
	},
	mounted : function () {
		axios
	    .get(this.url + "/board")
	    .then(function(response){
	    	this.resultDatas = response.data;
	    }.bind(this))
	    .catch(function(e) {
	    });
	},
	methods : {
		getBoardDetail : function (seq) {
			window.location.href = "/board/detail?seq=" + seq;
		}
	},
	computed : function () {
		
	},
	watch : {
		
	}
});
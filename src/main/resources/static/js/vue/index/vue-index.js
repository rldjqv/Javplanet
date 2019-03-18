var indexJs = new Vue ({
	el : "#vue_index",
	data : {
		resultDatas : {},
		url : location.origin + "/api/index"
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
		
	},
	methods : {

	},
	computed : function () {
		
	},
	watch : {
		
	}
});
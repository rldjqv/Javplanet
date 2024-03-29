var loginVue = new Vue ({
	el : "#vue_login",
	data : {
		url : location.origin + "/api/user",
		loginParam : {
			userId : '',
			password : ''			
		},
		resultDatas : {}
	},
	created : function () {
	
	},
	mounted : function () {
		
	},
	methods : {
		getLogin : function() {
			axios({
				method: 'get',
				url: this.url + "/login",
				params : this.loginParam
			})
			.then(function (response) {
				this.resultDatas = response.data;
				if (this.resultDatas.data != null && this.resultDatas.data != '') {
					alert(this.resultDatas.data.userNickName + "님 환영합니다.");
					history.back();
				} else {
					alert("회원정보가 일치하지 않습니다.")
				}
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
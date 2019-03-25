var loginJs = new Vue ({
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
				if (this.resultDatas != null && this.resultDatas != '') {
					alert(this.resultDatas.userNickName + "님 환영합니다.")
					window.location.href = "/";
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
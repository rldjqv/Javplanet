var registerJs = new Vue ({
	el : "#vue_register",
	data : {
		url : location.origin + "/api/user",
		registerParam : {
			userId : '',
			password : '',
			userNickName : ''
		},
		resultDatas : {},
		passwordForm : '',
		passwordConfirmForm : '',
		isCheckUserId : false,
		isCheckPasswordValid : false,
		isCheckPasswordConfirm : false,
		isCheckUserNickName : false
	},
	created : function () {
	
	},
	mounted : function () {
		
	},
	methods : {
		getUserIdCheck : function () {
			axios({
				method: 'get',
				url: this.url + "/getUserIdCheck",
				params : this.registerParam.userId
			})
			.then(function (response) {
				if(response.data > 0) {
					alert("이미 사용중인 ID입니다.");
					this.registerParam.userId = '';
				} else {
					alert("사용 가능한 ID입니다.");
					this.isCheckUserId = true;
				}
			}.bind(this))
			.catch(function(e) {
			});
		},
		getUserNickNameCheck : function () {
			axios({
				method: 'get',
				url: this.url + "/getUserNickNameCheck",
				params : this.registerParam.userNickName
			})
			.then(function (response) {
				if(response.data > 0) {
					alert("이미 사용중인 닉네임입니다.");
					this.registerParam.userNickName = '';
				} else {
					alert("사용 가능한 닉네임입니다.");
					this.isCheckUserNickName = true;
				}
			}.bind(this))
			.catch(function(e) {
			});
		},
		getIsCheckPasswordConfirm : function () {
			
		}
	},
	computed : {
		getIsCheckPasswordValid : function () {
			if(this.registerParam.password.length > 0) {
				this.passwordForm = "패스워드는 8자리이상"; 
			}
		}
	},
	watch : {

	}
});
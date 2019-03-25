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
		passwordConfirm : '',
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
				params : this.registerParam
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
				params : this.registerParam
			})
			.then(function (response) {
				if(response.data > 0) {
					this.isCheckUserNickName = false;
					this.registerParam.userNickName = '';
					alert("이미 사용중인 닉네임입니다.");
				} else {
					this.isCheckUserNickName = true;
					alert("사용 가능한 닉네임입니다.");
				}
				
			}.bind(this))
			.catch(function(e) {
			});
		},
		postUserRegister : function () {
			
		},
		setFormReset : function () {
			var isReset = confirm("모든값을 초기화 하시겠습니까?");
			if (isReset) {
				this.registerParam.userId = '';
				this.registerParam.password = '';
				this.registerParam.userNickName = '';
				this.passwordConfirm = '';
				this.isCheckUserId = false;
				this.isCheckPasswordValid = false;
				this.isCheckPasswordConfirm = false;
				this.isCheckUserNickName = false;
			} else {
				return;
			}
		}
		
	},
	computed : {
		getIsCheckPasswordValid : function () {
			if (8 <= this.registerParam.password.length && this.registerParam.password.length <= 12) {
				this.isCheckPasswordValid = true;
				return "패스워드 체크 완료"
			} else {
				this.isCheckPasswordValid = false;
				return "패스워드는 8자리이상 12자리 미만입니다.";
			}
		},
		getIsCheckPasswordConfirm : function () {
			if (this.isCheckPasswordValid) {
				if(this.passwordConfirm == this.registerParam.password) {
					this.isCheckPasswordConfirm = true;
					return "패스워드 확인 완료";
				} else {
					this.isCheckPasswordConfirm = false;
					return "패스워드가 일치하지 않습니다."
				}
			}
			return "";
		}
	},
	watch : {
		
	}
});
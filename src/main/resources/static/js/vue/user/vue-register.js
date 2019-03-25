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
			if(this.registerParam.userId.length == 0) {
				alert("아이디는 공백일수 없습니다.");
				return;
			} else if(this.registerParam.userId.length > 10) {
				alert("아이디는 10자리 이상 작성 할 수 없습니다.");
				return;
			}
			
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
			if(this.registerParam.userNickName.length == 0) {
				alert("별명은 공백일수 없습니다.");
				return;
			} else if(this.registerParam.userNickName.length > 10) {
				alert("별명은 10자리 이상 작성 할 수 없습니다.");
				return;
			}
			
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
			if(!this.isCheckUserId) {
				alert("아이디 중복체크를 진행주시기 바랍니다.");
				return;
			}
			if (!this.isCheckPasswordValid) {
				alert("패스워드는 8자리이상 12자리 미만입니다.");
				return;
			}
			if (!this.isCheckPasswordConfirm) {
				alert("패스워드를 동일하게 작성해주시기 바랍니다.");
				return;
			}
			if (!this.isCheckUserNickName) {
				alert("닉네임 중복체크를 진행해주시기 바랍니다.");
				return;
			}
			
			axios
		    .post(this.url + "/register", this.registerParam)
		    .then(function(response){
		    	alert("회원가입 해주셔서 감사합니다.");
		    	window.location.href = "/";
		    }.bind(this))
		    .catch(function(e) {
		    	alert("회원가입에 실패하였습니다. \n" + e.toString());
		    });
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
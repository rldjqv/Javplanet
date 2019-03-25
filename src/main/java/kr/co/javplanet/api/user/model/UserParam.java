package kr.co.javplanet.api.user.model;

import kr.co.javplanet.common.param.BaseParam;

public class UserParam extends BaseParam {
	public User data = new User();
	public class User {
		public String userId;
		public String password;
		public String userName;
		public String userNickName;
	}
}

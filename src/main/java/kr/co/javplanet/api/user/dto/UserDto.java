package kr.co.javplanet.api.user.dto;

import kr.co.javplanet.common.dto.BaseResult;

public class UserDto extends BaseResult {
	public UserData data = new UserData();
	public class UserData {
		public User data = new User();
	}
}

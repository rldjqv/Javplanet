package kr.co.javplanet.api.user.dto;

import kr.co.javplanet.api.user.model.UserParam;
import kr.co.javplanet.common.dto.BaseResult;

public class UserDto extends BaseResult {
	public UserParam data = new UserParam();
}

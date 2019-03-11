package kr.co.javplanet.api.user.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class UserListDto extends BaseResult {
	public UserData data = new UserData();
	public class UserData {
		public List<User> list = new ArrayList<User>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

package kr.co.javplanet.api.user.dao;

import java.util.List;

import kr.co.javplanet.api.user.dto.User;
import kr.co.javplanet.api.user.model.UserParam;


public interface UserDao {
	public List<User> getUsers(UserParam param);
	
}

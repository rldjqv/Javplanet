package kr.co.javplanet.api.user.dao;

import kr.co.javplanet.api.user.dto.User;
import kr.co.javplanet.api.user.model.UserParam;


public interface UserDao {
	public User getUser(UserParam param);
	public int getUserIdCheck(UserParam param);
	public int getUserNickNameCheck(UserParam param);
	public int postRegisterUser(UserParam param);
}

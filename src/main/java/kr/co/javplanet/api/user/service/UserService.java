package kr.co.javplanet.api.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.user.dao.UserDao;
import kr.co.javplanet.api.user.dto.UserListDto;
import kr.co.javplanet.api.user.model.UserParam;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDao userDao;

	public UserListDto getUsers(UserParam param) throws Exception {
		UserListDto result = new UserListDto();
		result.data.list = userDao.getUsers(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

package kr.co.javplanet.api.user.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.javplanet.api.user.dao.UserDao;
import kr.co.javplanet.api.user.dto.User;
import kr.co.javplanet.api.user.dto.UserDto;
import kr.co.javplanet.api.user.model.UserParam;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDao userDao;

	public UserDto getUser(UserParam param, HttpServletRequest request) throws Exception {
		UserDto result = new UserDto();
		result.data = userDao.getUser(param);
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> sessionObject = objectMapper.convertValue(result.data, Map.class);
		if (result.data != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("sessionObject", sessionObject);
		} else {
			
		}
		return result;
	}
	
	public int getUserIdCheck(UserParam param, HttpServletRequest request) {
		int getUserIdCheckCount = 0;
		getUserIdCheckCount = userDao.getUserIdCheck(param);
		return getUserIdCheckCount;
	}
	
	public int getUserNickNameCheck(UserParam param, HttpServletRequest request) {
		int getUserNickNameCheckCount = 0;
		getUserNickNameCheckCount = userDao.getUserNickNameCheck(param);
		return getUserNickNameCheckCount;
	}
	
	
	public int postRegisterUser(UserParam param, HttpServletRequest request) throws Exception {
		int postRegisterUserResult = 0;
		postRegisterUserResult = userDao.postRegisterUser(param);
		if (postRegisterUserResult > 0) {
			UserDto result = new UserDto();
			result.data = userDao.getUser(param);
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, Object> sessionObject = objectMapper.convertValue(result.data, Map.class);
			if (result.data != null) {
				HttpSession session = request.getSession(true);
				session.setAttribute("sessionObject", sessionObject);
			} else {
				
			}
		}
		return postRegisterUserResult;
	}
	
	public User logout(UserParam param, HttpServletRequest request) throws Exception {
		User result = new User();
		
		return result;
	}
}

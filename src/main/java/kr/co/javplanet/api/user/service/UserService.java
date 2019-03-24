package kr.co.javplanet.api.user.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import kr.co.javplanet.api.user.dao.UserDao;
import kr.co.javplanet.api.user.dto.User;
import kr.co.javplanet.api.user.model.UserParam;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDao userDao;

	public User getUser(UserParam param, HttpServletRequest request) throws Exception {
		User result = new User();
		result = userDao.getUser(param);
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> sessionObject = objectMapper.convertValue(result, Map.class);
		if (result != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("sessionObject", sessionObject);
		} else {
			
		}
		return result;
	}
	
	public User postUser(UserParam param, HttpServletRequest request) throws Exception {
		User result = new User();
		result = userDao.getUser(param);
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> sessionObject = objectMapper.convertValue(result, Map.class);
		if (result != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("sessionObject", sessionObject);
		} else {
			
		}
		return result;
	}
	
	public User logout(UserParam param, HttpServletRequest request) throws Exception {
		User result = new User();
		
		return result;
	}
}

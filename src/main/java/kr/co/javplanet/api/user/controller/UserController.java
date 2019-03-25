package kr.co.javplanet.api.user.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.user.dto.User;
import kr.co.javplanet.api.user.dto.UserListDto;
import kr.co.javplanet.api.user.model.UserParam;
import kr.co.javplanet.api.user.service.UserService;
import kr.co.javplanet.common.session.SessionManager;
import kr.co.javplanet.common.session.SessionObject;
import kr.co.javplanet.common.util.SHA256Util;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public User getUser(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UserParam userParam = new UserParam();
		userParam.data = gson.fromJson(gson.toJson(param), UserParam.User.class);
		userParam.data.password = SHA256Util.encrypt(userParam.data.password);
		return userService.getUser(userParam, request);
	}

	@GetMapping("/getUserIdCheck")
	public int getUserIdCheck(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UserParam userParam = new UserParam();
		userParam.data = gson.fromJson(gson.toJson(param), UserParam.User.class);
		return userService.getUserIdCheck(userParam, request);
	}
	
	@GetMapping("/getUserNickNameCheck")
	public int getUserNickNameCheck(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UserParam userParam = new UserParam();
		userParam.data = gson.fromJson(gson.toJson(param), UserParam.User.class);
		return userService.getUserNickNameCheck(userParam, request);
	}
	
	@PostMapping("/register")
	public User postUser(HttpServletRequest request, @RequestBody Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UserParam userParam = new UserParam();
		userParam.data = gson.fromJson(gson.toJson(param), UserParam.User.class);
		return userService.postUser(userParam, request);
	}
	
	@GetMapping("/logout")
	public void logout(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession(false);
		session.invalidate();
	}
}
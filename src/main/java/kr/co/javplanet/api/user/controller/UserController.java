package kr.co.javplanet.api.user.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.user.dto.UserListDto;
import kr.co.javplanet.api.user.model.UserParam;
import kr.co.javplanet.api.user.service.UserService;

@RestController
@RequestMapping(value = "/api")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public UserListDto getUsers(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UserParam userParam = new UserParam();
		userParam.data = gson.fromJson(gson.toJson(param), UserParam.User.class);
		return userService.getUsers(userParam);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public UserListDto postRegister(HttpServletRequest request, @RequestBody Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UserParam userParam = new UserParam();
		userParam.data = gson.fromJson(gson.toJson(param), UserParam.User.class);
		return userService.getUsers(userParam);
	}
}
package kr.co.javplanet.api.enter.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.enter.dto.EnterListDto;
import kr.co.javplanet.api.enter.model.EnterParam;
import kr.co.javplanet.api.enter.service.EnterService;

@RestController
@RequestMapping(value = "/api")
public class EnterController {
	private static final Logger logger = LoggerFactory.getLogger(EnterController.class);
	@Autowired
	private EnterService enterService;
	
	@RequestMapping(value = "/enter", method = RequestMethod.GET)
	@ResponseBody
	public EnterListDto getEnters(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		EnterParam enterParam = new EnterParam();
		enterParam.data = gson.fromJson(gson.toJson(param), EnterParam.Enter.class);
		return enterService.getEnters(enterParam);
	}
}
package kr.co.javplanet.api.celeb.controller;

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

import kr.co.javplanet.api.celeb.dto.CelebListDto;
import kr.co.javplanet.api.celeb.model.CelebParam;
import kr.co.javplanet.api.celeb.service.CelebService;

@RestController
@RequestMapping(value = "/api")
public class CelebController {
	private static final Logger logger = LoggerFactory.getLogger(CelebController.class);
	@Autowired
	private CelebService celebService;
	
	@RequestMapping(value = "/celeb", method = RequestMethod.GET)
	@ResponseBody
	public CelebListDto getCelebs(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		CelebParam celebParam = new CelebParam();
		celebParam.data = gson.fromJson(gson.toJson(param), CelebParam.Celeb.class);
		return celebService.getCelebs(celebParam);
	}
}
package kr.co.javplanet.api.sports.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.sports.dto.SportsListDto;
import kr.co.javplanet.api.sports.model.SportsParam;
import kr.co.javplanet.api.sports.service.SportsService;

@RestController
@RequestMapping(value = "/api")
public class SportsController {
	private static final Logger logger = LoggerFactory.getLogger(SportsController.class);
	@Autowired
	private SportsService sportsService;
	
	@GetMapping("/sports")
	public SportsListDto getSportss(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		SportsParam sportsParam = new SportsParam();
		sportsParam.data = gson.fromJson(gson.toJson(param), SportsParam.Sports.class);
		return sportsService.getSportss(sportsParam);
	}
}
package kr.co.javplanet.api.best.controller;

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

import kr.co.javplanet.api.best.dto.BestListDto;
import kr.co.javplanet.api.best.model.BestParam;
import kr.co.javplanet.api.best.service.BestService;

@RestController
@RequestMapping(value = "/api")
public class BestController {
	private static final Logger logger = LoggerFactory.getLogger(BestController.class);
	@Autowired
	private BestService bestService;
	
	@RequestMapping(value = "/best", method = RequestMethod.GET)
	@ResponseBody
	public BestListDto getBatchs(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		BestParam bestParam = new BestParam();
		bestParam.data = gson.fromJson(gson.toJson(param), BestParam.Best.class);
		return bestService.getBests(bestParam);
	}
}
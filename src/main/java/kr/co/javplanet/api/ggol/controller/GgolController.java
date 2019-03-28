package kr.co.javplanet.api.ggol.controller;

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

import kr.co.javplanet.api.ggol.dto.GgolListDto;
import kr.co.javplanet.api.ggol.model.GgolParam;
import kr.co.javplanet.api.ggol.service.GgolService;

@RestController
@RequestMapping(value = "/api")
public class GgolController {
	private static final Logger logger = LoggerFactory.getLogger(GgolController.class);
	@Autowired
	private GgolService ggolService;
	
	@GetMapping("/ggol")
	public GgolListDto getGgols(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		GgolParam ggolParam = new GgolParam();
		ggolParam.data = gson.fromJson(gson.toJson(param), GgolParam.Ggol.class);
		return ggolService.getGgols(ggolParam);
	}
}
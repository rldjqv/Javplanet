package kr.co.javplanet.api.gif.controller;

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

import kr.co.javplanet.api.gif.dto.GifListDto;
import kr.co.javplanet.api.gif.model.GifParam;
import kr.co.javplanet.api.gif.service.GifService;

@RestController
@RequestMapping(value = "/api")
public class GifController {
	private static final Logger logger = LoggerFactory.getLogger(GifController.class);
	@Autowired
	private GifService gifService;
	
	@RequestMapping(value = "/gif", method = RequestMethod.GET)
	@ResponseBody
	public GifListDto getgifs(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		GifParam gifParam = new GifParam();
		gifParam.data = gson.fromJson(gson.toJson(param), GifParam.Gif.class);
		return gifService.getGifs(gifParam);
	}
}
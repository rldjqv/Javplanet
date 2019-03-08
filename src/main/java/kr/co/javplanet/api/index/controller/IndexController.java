package kr.co.javplanet.api.index.controller;

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

import kr.co.javplanet.api.index.dto.IndexListDto;
import kr.co.javplanet.api.index.model.IndexParam;
import kr.co.javplanet.api.index.service.IndexService;

@RestController
@RequestMapping(value = "/api")
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private IndexService indexService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody
	public IndexListDto getindexs(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		IndexParam indexParam = new IndexParam();
		indexParam.data = gson.fromJson(gson.toJson(param), IndexParam.Index.class);
		return indexService.getIndexs(indexParam);
	}
}
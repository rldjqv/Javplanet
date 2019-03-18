package kr.co.javplanet.api.upload.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.upload.model.UploadParam;
import kr.co.javplanet.api.upload.service.UploadService;
import kr.co.javplanet.common.dto.BaseResult;
import kr.co.javplanet.common.session.SessionManager;
import kr.co.javplanet.common.session.SessionObject;

@RestController
@RequestMapping(value = "/api/upload")
public class UploadController {
    @Value("${file.upload.dir}")
    private String fileUploadDir;
    
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
	@Autowired
	private UploadService uploadService;
	
	@RequestMapping(value = "/contents", method = RequestMethod.POST, consumes="application/json", headers="content-type=application/x-www-form-urlencoded")
	@ResponseBody
	public BaseResult postContents(HttpServletRequest request, @RequestBody Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		UploadParam uploadParam = new UploadParam();
		SessionManager.setApiHeader(uploadParam, request);
		SessionObject so = SessionManager.getSessionObject(request);
		uploadParam.data = gson.fromJson(gson.toJson(param), UploadParam.Upload.class);
		return uploadService.postUpload(uploadParam);
	}
}
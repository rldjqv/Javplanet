package kr.co.javplanet.api.upload.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
	
	@PostMapping("/contents")
	public BaseResult postContents(HttpServletRequest request, @RequestParam Map<String, Object> param, @RequestParam MultipartFile[] images) throws Exception {
		Gson gson = new Gson();
		UploadParam uploadParam = new UploadParam();
		SessionManager.setApiHeader(uploadParam, request);
		uploadParam.data = gson.fromJson(gson.toJson(param), UploadParam.Upload.class);
		return uploadService.postContents(uploadParam);
	}
	
	@PostMapping("/files")
	public ResponseEntity<?> postImages(HttpServletRequest request, @RequestParam Map<String, Object> param, @RequestParam MultipartFile[] images) throws Exception {
//		Gson gson = new Gson();
//		UploadParam uploadParam = new UploadParam();
//		SessionManager.setApiHeader(uploadParam, request);
//		SessionObject so = SessionManager.getSessionObject(request);
		return null;
//		return uploadService.postImages(images);
	}
}
package kr.co.javplanet.api.upload.controller;

import java.io.File;
import java.util.Calendar;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

import kr.co.javplanet.api.upload.model.UploadParam;
import kr.co.javplanet.api.upload.service.UploadService;
import kr.co.javplanet.common.dto.BaseResult;
import kr.co.javplanet.common.session.SessionManager;

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
		if (images.length > 0) {
			Calendar cal = Calendar.getInstance();
			String YYYY = cal.get(cal.YEAR) + "";
			String MM = cal.get(cal.MONTH)+1 + "";
			String DD = cal.get(cal.DATE) + "";

			if (MM.length() == 1) {
				MM = "0" + MM;
			}

			if (DD.length() == 1) {
				DD = "0" + DD;
			}
			
			String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
			
			String contents = (String) param.get("contents");
			try {
				for (int i=0; i < images.length; i++) {
					contents = contents.replace("___IMAGE___"+i, uuid.toString() + "_" + images[i].getOriginalFilename());
					images[i].transferTo(new File(fileUploadDir, uuid.toString() + "_" + images[i].getOriginalFilename()));	
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			param.put("contents", contents);
		}
		
		Gson gson = new Gson();
		UploadParam uploadParam = new UploadParam();
		SessionManager.setApiHeader(uploadParam, request);
		uploadParam.data = gson.fromJson(gson.toJson(param), UploadParam.Upload.class);
		return uploadService.postContents(uploadParam);
	}
}

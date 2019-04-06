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
	public BaseResult postContents(HttpServletRequest request, @RequestParam Map<String, Object> param,
			@RequestParam MultipartFile[] images) throws Exception {
		if (images.length > 0) {
			Calendar cal = Calendar.getInstance();
			String YYYY = cal.get(cal.YEAR) + "";
			String MM = cal.get(cal.MONTH) + 1 + "";
			String DD = cal.get(cal.DATE) + "";

			if (MM.length() == 1) {
				MM = "0" + MM;
			}

			if (DD.length() == 1) {
				DD = "0" + DD;
			}

			String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 10);

			makeDirectory(YYYY, MM, DD);
			String contentsPrefix = YYYY + "/" + MM + "/" + DD + "/" + uuid;
			String filePrefix = uuid;
			String fileLocation = fileUploadDir + YYYY + "/" + MM + "/" + DD + "/";

			String contents = (String) param.get("contents");
			try {
				for (int i = 0; i < images.length; i++) {
					contents = contents.replace("___IMAGE___" + i,
							contentsPrefix + "_" + images[i].getOriginalFilename());
					images[i].transferTo(new File(fileLocation, filePrefix + "_" + images[i].getOriginalFilename()));
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

	public void makeDirectory(String YYYY, String MM, String DD) {
		File dirYYYY = new File(fileUploadDir + YYYY);
		if (!dirYYYY.exists()) {
			try {
				dirYYYY.mkdir();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

		File dirMM = new File(fileUploadDir + YYYY + "/" + MM);
		if (!dirMM.exists()) {
			try {
				dirMM.mkdir();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

		File dirDD = new File(fileUploadDir + YYYY + "/" + MM + "/" + DD);
		if (!dirDD.exists()) {
			try {
				dirDD.mkdir();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

//	@GetMapping("/temp")
//	public void temp(HttpServletRequest request) throws Exception {
//		Map<String, Object> param = new HashMap<String, Object>();
//		File file = new File("C:\\Users\\UP\\Desktop\\sexy.html");
//		String sLine = "";
//		String text = "";
//		if (file.exists()) {
//			BufferedReader inFile = new BufferedReader(new FileReader(file));
//			while ((sLine = inFile.readLine()) != null)
//				text += sLine;
//		}
//		String[] start = text.split("start");
//		String[] contents;
//		for (int i=0; i < start.length; i++) {
//			contents = start[i].split("__contents__");
//			if (contents.length > 1) {
//			param.put("title", contents[0]);
//			param.put("contents", contents[1]);
//			uploadService.postTemp(param);
//			}
//		}
//	}
}

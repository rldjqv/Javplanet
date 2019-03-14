package kr.co.javplanet.api.upload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.upload.dao.UploadDao;
import kr.co.javplanet.api.upload.dto.UploadListDto;
import kr.co.javplanet.api.upload.model.UploadParam;

@Service
public class UploadService {
	private static final Logger logger = LoggerFactory.getLogger(UploadService.class);
	@Autowired
	private UploadDao uploadDao;

	public UploadListDto getUploads(UploadParam param) throws Exception {
		UploadListDto result = new UploadListDto();
		result.data.list = uploadDao.getUpload(param);
		result.header.resultCnt = result.data.list.size();
		return result;
	}
}

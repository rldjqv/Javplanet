package kr.co.javplanet.api.upload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.upload.dao.UploadDao;
import kr.co.javplanet.api.upload.dto.UploadDto;
import kr.co.javplanet.api.upload.model.UploadParam;

@Service
public class UploadService {
	private static final Logger logger = LoggerFactory.getLogger(UploadService.class);
	@Autowired
	private UploadDao uploadDao;

	public UploadDto postContents(UploadParam param) throws Exception {
		UploadDto result = new UploadDto();
		result.header.totalCnt = uploadDao.postContents(param);
		result.data.seq= param.data.seq;
		return result;
	}
	
	public UploadDto postImages(UploadParam param) throws Exception {
		UploadDto result = new UploadDto();
		result.header.totalCnt = uploadDao.postContents(param);
		result.data.seq= param.data.seq;
		return result;
	}
}

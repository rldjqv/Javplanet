package kr.co.javplanet.api.upload.dao;

import java.util.List;

import kr.co.javplanet.api.upload.dto.Upload;
import kr.co.javplanet.api.upload.model.UploadParam;


public interface UploadDao {
	public List<Upload> getUpload(UploadParam param);
	
}

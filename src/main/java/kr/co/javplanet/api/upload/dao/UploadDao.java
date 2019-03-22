package kr.co.javplanet.api.upload.dao;

import kr.co.javplanet.api.upload.model.UploadParam;


public interface UploadDao {
	public int postContents(UploadParam param);
	
}

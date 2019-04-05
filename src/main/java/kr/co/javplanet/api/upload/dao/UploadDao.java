package kr.co.javplanet.api.upload.dao;

import java.util.Map;

import kr.co.javplanet.api.upload.model.UploadParam;


public interface UploadDao {
	public int postContents(UploadParam param);
	public int postTemp(Map<String, Object> param);
}

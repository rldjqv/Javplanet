package kr.co.javplanet.api.upload.dto;

import kr.co.javplanet.api.upload.model.UploadParam;
import kr.co.javplanet.common.dto.BaseResult;

public class UploadDto extends BaseResult {
	public UploadParam data = new UploadParam();
}

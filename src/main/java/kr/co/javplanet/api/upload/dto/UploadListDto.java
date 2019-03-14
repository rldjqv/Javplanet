package kr.co.javplanet.api.upload.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class UploadListDto extends BaseResult {
	public UploadData data = new UploadData();
	public class UploadData {
		public List<Upload> list = new ArrayList<Upload>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

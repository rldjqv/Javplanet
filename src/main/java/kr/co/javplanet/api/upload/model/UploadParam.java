package kr.co.javplanet.api.upload.model;

import java.io.File;
import java.util.List;

import kr.co.javplanet.common.param.BaseParam;

public class UploadParam extends BaseParam {
	public Upload data = new Upload();
	public class Upload {
		public int seq;
		public String category;
		public String title;
		public String contents;
		public List<File> images;
		
	}
}

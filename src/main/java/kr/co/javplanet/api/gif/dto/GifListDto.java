package kr.co.javplanet.api.gif.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class GifListDto extends BaseResult {
	public GifData data = new GifData();
	public class GifData {
		public List<Gif> list = new ArrayList<Gif>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

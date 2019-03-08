package kr.co.javplanet.api.index.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class IndexListDto extends BaseResult {
	public IndexData data = new IndexData();
	public class IndexData {
		public List<Index> list = new ArrayList<Index>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

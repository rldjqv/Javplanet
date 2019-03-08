package kr.co.javplanet.api.best.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class BestListDto extends BaseResult {
	public BatchData data = new BatchData();
	public class BatchData {
		public List<Best> list = new ArrayList<Best>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

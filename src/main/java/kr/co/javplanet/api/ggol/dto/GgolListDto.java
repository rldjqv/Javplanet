package kr.co.javplanet.api.ggol.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class GgolListDto extends BaseResult {
	public GgolData data = new GgolData();
	public class GgolData {
		public List<Ggol> list = new ArrayList<Ggol>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

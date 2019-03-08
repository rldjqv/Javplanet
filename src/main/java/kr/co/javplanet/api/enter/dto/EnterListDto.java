package kr.co.javplanet.api.enter.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class EnterListDto extends BaseResult {
	public EnterData data = new EnterData();
	public class EnterData {
		public List<Enter> list = new ArrayList<Enter>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

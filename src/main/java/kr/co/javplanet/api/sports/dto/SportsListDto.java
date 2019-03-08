package kr.co.javplanet.api.sports.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class SportsListDto extends BaseResult {
	public SportsData data = new SportsData();
	public class SportsData {
		public List<Sports> list = new ArrayList<Sports>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

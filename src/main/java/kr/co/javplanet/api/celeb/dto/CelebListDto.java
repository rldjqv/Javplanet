package kr.co.javplanet.api.celeb.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class CelebListDto extends BaseResult {
	public CelebData data = new CelebData();
	public class CelebData {
		public List<Celeb> list = new ArrayList<Celeb>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

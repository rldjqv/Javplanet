package kr.co.javplanet.api.issue.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class IssueListDto extends BaseResult {
	public IssueData data = new IssueData();
	public class IssueData {
		public List<Issue> list = new ArrayList<Issue>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

package kr.co.javplanet.api.issue.dto;

import kr.co.javplanet.api.issue.model.IssueParam;
import kr.co.javplanet.common.dto.BaseResult;

public class IssueDto extends BaseResult {
	public IssueParam data = new IssueParam();
}

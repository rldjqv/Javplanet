package kr.co.javplanet.api.issue.dao;

import java.util.List;

import kr.co.javplanet.api.issue.dto.Issue;
import kr.co.javplanet.api.issue.model.IssueParam;


public interface IssueDao {
	public List<Issue> getIssues(IssueParam param);
	
}

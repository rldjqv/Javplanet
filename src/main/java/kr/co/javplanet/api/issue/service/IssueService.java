package kr.co.javplanet.api.issue.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.issue.dao.IssueDao;
import kr.co.javplanet.api.issue.dto.IssueListDto;
import kr.co.javplanet.api.issue.model.IssueParam;

@Service
public class IssueService {
	private static final Logger logger = LoggerFactory.getLogger(IssueService.class);
	@Autowired
	private IssueDao issueDao;

	public IssueListDto getIssues(IssueParam param) throws Exception {
		IssueListDto result = new IssueListDto();
		result.data.list = issueDao.getIssues(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

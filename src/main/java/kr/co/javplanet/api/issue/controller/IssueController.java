package kr.co.javplanet.api.issue.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.issue.dto.IssueListDto;
import kr.co.javplanet.api.issue.model.IssueParam;
import kr.co.javplanet.api.issue.service.IssueService;

@RestController
@RequestMapping(value = "/api")
public class IssueController {
	private static final Logger logger = LoggerFactory.getLogger(IssueController.class);
	@Autowired
	private IssueService issueService;
	
	@GetMapping("/issue")
	public IssueListDto getissues(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		IssueParam issueParam = new IssueParam();
		issueParam.data = gson.fromJson(gson.toJson(param), IssueParam.Issue.class);
		return issueService.getIssues(issueParam);
	}
}
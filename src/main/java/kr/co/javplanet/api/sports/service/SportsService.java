package kr.co.javplanet.api.sports.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.sports.dao.SportsDao;
import kr.co.javplanet.api.sports.dto.SportsListDto;
import kr.co.javplanet.api.sports.model.SportsParam;

@Service
public class SportsService {
	private static final Logger logger = LoggerFactory.getLogger(SportsService.class);
	@Autowired
	private SportsDao sportsDao;

	public SportsListDto getSportss(SportsParam param) throws Exception {
		SportsListDto result = new SportsListDto();
		result.data.list = sportsDao.getSportss(param);
		result.header.resultCnt = result.data.list.size();
		return result;
	}
}

package kr.co.javplanet.api.enter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.enter.dao.EnterDao;
import kr.co.javplanet.api.enter.dto.EnterListDto;
import kr.co.javplanet.api.enter.model.EnterParam;

@Service
public class EnterService {
	private static final Logger logger = LoggerFactory.getLogger(EnterService.class);
	@Autowired
	private EnterDao enterDao;

	public EnterListDto getEnters(EnterParam param) throws Exception {
		EnterListDto result = new EnterListDto();
		result.data.list = enterDao.getEnters(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

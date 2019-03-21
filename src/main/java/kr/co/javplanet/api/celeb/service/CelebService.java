package kr.co.javplanet.api.celeb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.celeb.dao.CelebDao;
import kr.co.javplanet.api.celeb.dto.CelebListDto;
import kr.co.javplanet.api.celeb.model.CelebParam;

@Service
public class CelebService {
	private static final Logger logger = LoggerFactory.getLogger(CelebService.class);
	@Autowired
	private CelebDao celebDao;

	public CelebListDto getCelebs(CelebParam param) throws Exception {
		CelebListDto result = new CelebListDto();
		result.data.list = celebDao.getCelebs(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

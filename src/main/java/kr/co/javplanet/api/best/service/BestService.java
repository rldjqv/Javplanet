package kr.co.javplanet.api.best.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.best.dao.BestDao;
import kr.co.javplanet.api.best.dto.BestListDto;
import kr.co.javplanet.api.best.model.BestParam;

@Service
public class BestService {
	private static final Logger logger = LoggerFactory.getLogger(BestService.class);
	@Autowired
	private BestDao bestDao;

	public BestListDto getBests(BestParam param) throws Exception {
		BestListDto result = new BestListDto();
		result.data.list = bestDao.getBests(param);
		result.header.resultCnt = result.data.list.size();
		return result;
	}
}

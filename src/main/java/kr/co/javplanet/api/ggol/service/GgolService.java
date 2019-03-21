package kr.co.javplanet.api.ggol.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.ggol.dao.GgolDao;
import kr.co.javplanet.api.ggol.dto.GgolListDto;
import kr.co.javplanet.api.ggol.model.GgolParam;

@Service
public class GgolService {
	private static final Logger logger = LoggerFactory.getLogger(GgolService.class);
	@Autowired
	private GgolDao ggolDao;

	public GgolListDto getGgols(GgolParam param) throws Exception {
		GgolListDto result = new GgolListDto();
		result.data.list = ggolDao.getGgols(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

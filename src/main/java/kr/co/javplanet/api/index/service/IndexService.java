package kr.co.javplanet.api.index.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.index.dao.IndexDao;
import kr.co.javplanet.api.index.dto.IndexListDto;
import kr.co.javplanet.api.index.model.IndexParam;

@Service
public class IndexService {
	private static final Logger logger = LoggerFactory.getLogger(IndexService.class);
	@Autowired
	private IndexDao indexDao;

	public IndexListDto getIndexs(IndexParam param) throws Exception {
		IndexListDto result = new IndexListDto();
		result.data.list = indexDao.getIndexs(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

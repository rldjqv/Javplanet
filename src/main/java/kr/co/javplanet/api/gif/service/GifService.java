package kr.co.javplanet.api.gif.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.gif.dao.GifDao;
import kr.co.javplanet.api.gif.dto.GifListDto;
import kr.co.javplanet.api.gif.model.GifParam;

@Service
public class GifService {
	private static final Logger logger = LoggerFactory.getLogger(GifService.class);
	@Autowired
	private GifDao gifDao;

	public GifListDto getGifs(GifParam param) throws Exception {
		GifListDto result = new GifListDto();
		result.data.list = gifDao.getGifs(param);
		result.header.totalCnt = result.data.list.size();
		return result;
	}
}

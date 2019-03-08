package kr.co.javplanet.api.game.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.game.dao.GameDao;
import kr.co.javplanet.api.game.dto.GameListDto;
import kr.co.javplanet.api.game.model.GameParam;

@Service
public class GameService {
	private static final Logger logger = LoggerFactory.getLogger(GameService.class);
	@Autowired
	private GameDao gameDao;

	public GameListDto getGames(GameParam param) throws Exception {
		GameListDto result = new GameListDto();
		result.data.list = gameDao.getGames(param);
		result.header.resultCnt = result.data.list.size();
		return result;
	}
}

package kr.co.javplanet.api.game.dao;

import java.util.List;

import kr.co.javplanet.api.game.dto.Game;
import kr.co.javplanet.api.game.model.GameParam;


public interface GameDao {
	public List<Game> getGames(GameParam param);
	
}

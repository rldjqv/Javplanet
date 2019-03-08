package kr.co.javplanet.api.game.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class GameListDto extends BaseResult {
	public GameData data = new GameData();
	public class GameData {
		public List<Game> list = new ArrayList<Game>();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

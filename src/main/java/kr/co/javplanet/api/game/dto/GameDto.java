package kr.co.javplanet.api.game.dto;

import kr.co.javplanet.api.game.model.GameParam;
import kr.co.javplanet.common.dto.BaseResult;

public class GameDto extends BaseResult {
	public GameParam data = new GameParam();
}

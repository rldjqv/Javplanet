package kr.co.javplanet.api.board.dto;

import kr.co.javplanet.api.board.model.BoardParam;
import kr.co.javplanet.common.dto.BaseResult;

public class BoardDto extends BaseResult {
	public BoardParam data = new BoardParam();
}

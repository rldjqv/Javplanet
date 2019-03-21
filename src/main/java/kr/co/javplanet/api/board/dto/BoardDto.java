package kr.co.javplanet.api.board.dto;

import kr.co.javplanet.common.dto.BaseResult;

public class BoardDto extends BaseResult {
	public BoardData data = new BoardData();
	public class BoardData {
		public Board data = new Board();
		public int totalcnt;
		public int limit;
		public int offset;
	}
}

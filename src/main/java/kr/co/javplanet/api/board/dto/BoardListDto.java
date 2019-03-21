package kr.co.javplanet.api.board.dto;

import java.util.ArrayList;
import java.util.List;

import kr.co.javplanet.common.dto.BaseResult;

public class BoardListDto extends BaseResult {
	public BoardData data = new BoardData();
	public class BoardData {
		public List<Board> list = new ArrayList<Board>();
		public int resultCnt;
		public int limit;
		public int offset;
	}
}

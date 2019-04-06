package kr.co.javplanet.api.board.model;

import kr.co.javplanet.common.param.BaseParam;

public class BoardParam extends BaseParam {
	public Board data = new Board();
	public class Board {
		public int offset;
		public int seq;
		public String searchText;
	}
}

package kr.co.javplanet.api.board.dao;

import java.util.List;

import kr.co.javplanet.api.board.dto.Board;
import kr.co.javplanet.api.board.model.BoardParam;

public interface BoardDao {
	public List<Board> getBoards(BoardParam param);
	public int getBoardsTotalCnt(BoardParam param);
	public Board getBoardDetail(BoardParam param);
	public int putBoardDetailViewCount(BoardParam param);
}

package kr.co.javplanet.api.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.javplanet.api.board.dao.BoardDao;
import kr.co.javplanet.api.board.dto.BoardListDto;
import kr.co.javplanet.api.board.model.BoardParam;

@Service
public class BoardService {
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	@Autowired
	private BoardDao boardDao;

	public BoardListDto getBoards(BoardParam param) throws Exception {
		BoardListDto result = new BoardListDto();
		result.data.list = boardDao.getBoards(param);
		result.header.resultCnt = result.data.list.size();
		return result;
	}

	public BoardListDto getBoardDetail(BoardParam param) throws Exception {
		BoardListDto result = new BoardListDto();
		result.data.list = boardDao.getBoards(param);
		result.header.resultCnt = result.data.list.size();
		return result;
	}
	
}

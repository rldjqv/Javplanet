package kr.co.javplanet.api.board.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.board.dto.BoardListDto;
import kr.co.javplanet.api.board.model.BoardParam;
import kr.co.javplanet.api.board.service.BoardService;
import kr.co.javplanet.common.session.SessionManager;
import kr.co.javplanet.common.session.SessionObject;

@RestController
@RequestMapping(value = "/api")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET, produces="application/json; charset=UTF-8")
	@ResponseBody
	public BoardListDto getBoards(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		BoardParam boardParam = new BoardParam();
		SessionManager.setApiHeader(boardParam, request);
		SessionObject so = SessionManager.getSessionObject(request);
		boardParam.data = gson.fromJson(gson.toJson(param), BoardParam.Board.class);
		return boardService.getBoards(boardParam);
	}
	
	@RequestMapping(value = "/board/detail/{seq}", method = RequestMethod.GET, produces="application/json; charset=UTF-8")
	@ResponseBody
	public BoardListDto getBoardDetail(HttpServletRequest request, @PathVariable int seq) throws Exception {
		Gson gson = new Gson();
		BoardParam boardParam = new BoardParam();
		SessionManager.setApiHeader(boardParam, request);
		SessionObject so = SessionManager.getSessionObject(request);
		boardParam.data.seq = seq;
		return boardService.getBoardDetail(boardParam);
	}
}
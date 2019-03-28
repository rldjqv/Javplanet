package kr.co.javplanet.api.game.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import kr.co.javplanet.api.game.dto.GameListDto;
import kr.co.javplanet.api.game.model.GameParam;
import kr.co.javplanet.api.game.service.GameService;

@RestController
@RequestMapping(value = "/api")
public class GameController {
	private static final Logger logger = LoggerFactory.getLogger(GameController.class);
	@Autowired
	private GameService gameService;
	
	@GetMapping("/game")
	public GameListDto getGames(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		Gson gson = new Gson();
		GameParam gameParam = new GameParam();
		gameParam.data = gson.fromJson(gson.toJson(param), GameParam.Game.class);
		return gameService.getGames(gameParam);
	}
}
package kr.co.javplanet.front.game;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/game")
public class FrontGameController {
	
	@GetMapping("")
	public String game(Model model, final HttpServletRequest request) throws Exception {
		return "game/game";
	}
}
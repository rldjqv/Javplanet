package kr.co.javplanet.front.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class FrontBoardController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String board(Model model, final HttpServletRequest request) throws Exception {
		return "board";
	}
}
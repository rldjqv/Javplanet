package kr.co.javplanet.front.sports;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/sports")
public class FrontSportsController {

	@GetMapping("")
	public String sports(Model model, final HttpServletRequest request) throws Exception {
		return "sports/sports";
	}
}
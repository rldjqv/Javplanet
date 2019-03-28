package kr.co.javplanet.front.best;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/best")
public class FrontBestController {
	
	@GetMapping("")
	public String best(Model model, final HttpServletRequest request) throws Exception {
		return "best/best";
	}
}
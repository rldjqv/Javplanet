package kr.co.javplanet.front.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/error")
public class FrontErrorController {
	
	@GetMapping("")
	public String game(Model model, final HttpServletRequest request) throws Exception {
		return "error/404";
	}
}
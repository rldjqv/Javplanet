package kr.co.javplanet.front.celeb;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/celeb")
public class FrontCelebController {
	
	@GetMapping("")
	public String celeb(Model model, final HttpServletRequest request) throws Exception {
		return "celeb/celeb";
	}
}
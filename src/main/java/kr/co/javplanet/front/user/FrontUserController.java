package kr.co.javplanet.front.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class FrontUserController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, final HttpServletRequest request) throws Exception {
		return "user/login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model, final HttpServletRequest request) throws Exception {
		return "user/register";
	}
}
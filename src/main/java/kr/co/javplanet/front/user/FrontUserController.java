package kr.co.javplanet.front.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class FrontUserController {
	
	@GetMapping("/login")
	public String login(Model model, final HttpServletRequest request) throws Exception {
		return "user/login";
	}
	
	@GetMapping("/register")
	public String register(Model model, final HttpServletRequest request) throws Exception {
		return "user/register";
	}
}
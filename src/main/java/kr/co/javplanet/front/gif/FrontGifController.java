package kr.co.javplanet.front.gif;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/gif")
public class FrontGifController {
	
	@GetMapping("")
	public String gif(Model model, final HttpServletRequest request) throws Exception {
		return "gif/gif";
	}
}
package kr.co.javplanet.front.index;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class FrontIndexController {
	
	@GetMapping("")
	public String index(Model model, final HttpServletRequest request) throws Exception {
		return "index/index";
	}
}
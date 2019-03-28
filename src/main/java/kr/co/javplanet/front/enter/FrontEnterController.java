package kr.co.javplanet.front.enter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/enter")
public class FrontEnterController {
	
	@GetMapping("")
	public String enter(Model model, final HttpServletRequest request) throws Exception {
		return "enter/enter";
	}
}
package kr.co.javplanet.front.ggol;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ggol")
public class FrontGgolController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String ggol(Model model, final HttpServletRequest request) throws Exception {
		return "ggol/ggol";
	}
}
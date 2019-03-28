package kr.co.javplanet.front.upload;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/upload")
public class FrontUploadController {
	
	@GetMapping("/contents")
	public String uploadsContents(Model model, final HttpServletRequest request) throws Exception {
		return "upload/contents";
	}
}
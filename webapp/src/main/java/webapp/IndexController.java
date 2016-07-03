package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;

@Controller
public class IndexController {

	@RequestMapping(value = "/index.html")
	public String toPage1(){
		return "/index";
	}
	
}

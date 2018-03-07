package dom.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(path ="/*.svj", method=RequestMethod.GET)
	public String getWelcomePage(){
		return "Welcome";
	}
}

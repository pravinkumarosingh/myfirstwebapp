package com.sugarglider.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model ){
    	model.put("name", name);
    	logger.debug("Request param at debug level {}", name);
    	logger.info("Request param at info level {}", name);
    	logger.info("Request param at warn level {}", name);
    	//System.out.println("Request Param is "+name);
        return "login";
    }
}

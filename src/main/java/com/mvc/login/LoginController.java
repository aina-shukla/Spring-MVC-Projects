package com.mvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("uname")
public class LoginController {

	@Autowired
	UserValidationService uValidService ;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String uname, @RequestParam String password, ModelMap model) {
		if (uValidService.isUserValid(uname, password)) {
			model.put("uname", uname);
			model.put("password", password);
			// System.out.println(uname); //console
			return "welcome";
		} else
		{
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
	}
	}
}

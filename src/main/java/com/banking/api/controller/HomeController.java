package com.banking.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.api.domain.User;
import com.banking.api.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	/** Because of @Controller, this class will be registered as a bean in Spring container. */
	@RequestMapping("/")
	public String home(){
		/** Because of @RequestMapping, Spring looks for corresponding file in template */
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model){
		User user = new User();
		
		model.addAttribute("user", user);
		
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user,  Model model) {
/** @ModelAttribute Retrieves the values posted and assigns to those in the object in the arguments of the method */
        if(userService.checkUserExists(user.getUsername(), user.getEmail()))  {

            if (userService.checkEmailExists(user.getEmail())) {
                model.addAttribute("emailExists", true);
            }

            if (userService.checkUsernameExists(user.getUsername())) {
                model.addAttribute("usernameExists", true);
            }

            return "signup";
        } else {

            userService.save(user);

            return "redirect:/";
        }
    }

}

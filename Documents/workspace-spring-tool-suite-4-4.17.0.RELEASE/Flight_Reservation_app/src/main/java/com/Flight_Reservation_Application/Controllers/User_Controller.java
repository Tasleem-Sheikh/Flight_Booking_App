package com.Flight_Reservation_Application.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight_Reservation_Application.Entities.User;
import com.Flight_Reservation_Application.Repositories.UserRepository;

@Controller
public class User_Controller {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/showRegistration")
	public String ShowReg() {
		return "login/showRegistration";
	}
	
	
	
	@PostMapping("/register")
	private String Register(@ModelAttribute("user") User user,ModelMap modelMap) {
		userRepository.save(user);
		modelMap.addAttribute("msg","registered successfully");
		
		return "login/showRegistration";
	}
}

package com.arini.phonestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	    @RequestMapping({"/","/welcome"})
	    public String welcome(Model model) {
	        model.addAttribute("greeting","Welcome to Phone Store!");
	        model.addAttribute("tagline","Online Phone Store");
	        return "welcome";
	    }
	    
	}

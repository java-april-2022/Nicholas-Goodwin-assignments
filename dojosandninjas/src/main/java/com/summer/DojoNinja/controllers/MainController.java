package com.summer.DojoNinja.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.summer.DojoNinja.models.Dojo;
import com.summer.DojoNinja.models.Ninja;
import com.summer.DojoNinja.services.DojoService;
import com.summer.DojoNinja.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	private NinjaService ninjas;
	@Autowired
	private DojoService dojos;
	
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojoForm.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "newNinja.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		System.out.printf("dojo id from url: %s",id);
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		
		return "showDojo.jsp";
	}
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		Dojo newDojo = dojos.create(dojo);
		System.out.printf("new id: %s", dojo.getId());
		
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = Ninja.create(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
}

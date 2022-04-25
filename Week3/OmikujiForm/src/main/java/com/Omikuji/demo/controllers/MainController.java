package com.Omikuji.demo.controllers;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return"redirect:/omikuji";
	}
	@GetMapping("/omikuji")
	public String omikuji() {
		return "Index.jsp";
	}
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("resultOmikuji");
		model.addAttribute("result", result);
		return "doneOmikuji.jsp";
	}
	@PostMapping("/processFormData")
	public String process(
			@RequestParam("numbers") int number,//match to index.jsp values 
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("create") String create,
			@RequestParam("living") String living,
			@RequestParam("message") String message,
			HttpSession session) {	//session in method
		String resultOmikuji = String.format("In %s years you will live in %s with %s as your roommate, selling %s for a living. "
				+ "The next time you see a %s, "
				+ "you will have good luck. Also, %s.",number, city, person, create, living, message);//printed info linked with input from form
		session.setAttribute("resultOmikuji", resultOmikuji); //applying information in session, same as show method
		return "redirect:/omikuji/show"; //redirect
	}//note to self: if run with empty fields produces whitelabel error for failing to convert value types, try and add validtion at a later date or maybe input types are generally wrong but work with variables provided?
}

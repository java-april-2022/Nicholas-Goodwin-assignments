package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String daikichi() {
		return "WELCOME!";
	}
	@RequestMapping("/today") 
		public String today() {
			return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("tomorrow")
	public String tomorrow() {
		return "Tomorrow an oppurtunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable String city) {
		return "The stars have aligned and someone paid off your student loans, celebrate by visiting " + city;
	}
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable int number) {
		if (number % 2 == 0) {
			return "Much like Bill and Ted, your coming adventures will be excellent but be weary of tempting offers!";
		}
		else
			return "The adventures and offers were too excellent and you are now insanely broke, hangout with your cats or go back to work champ!";
	} // used https://www.programiz.com/javascript/examples/even-odd as a useful guide for the odds or evens portion!
}

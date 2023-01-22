package kata_java.PP_3_1_2_CRUD_Spring_Boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm simple CRUD application");
		messages.add("Introducing Users model");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}
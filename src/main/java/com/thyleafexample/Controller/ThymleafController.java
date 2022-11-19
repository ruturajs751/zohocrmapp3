package com.thyleafexample.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymleafController {
	@RequestMapping("/variable-expression")
	public String variable_expression(Model model){
		Student student=new Student(1,"mike","chennai","mike@gmail.com");
		model.addAttribute("student", student);
		model.addAttribute("user", "mike");
		return "variable-expression";
	}
	@RequestMapping("/selection-expression")
	public String selection_expression(Model model) {
		Student student=new Student(1,"mike","chennai","mike@gmail.com");
		model.addAttribute("student", student);
		return "selection-expression";
	}
	@RequestMapping("/message-expression")
	public String message_expression() {
		return "message-expression";
	}
	@RequestMapping("/link-expression")
	public String linkExpression(Model model) {
	model.addAttribute("id", 2);
	return "link_expression";
	}
	
	@RequestMapping("/fragment-expression")
	public String fragmentExpression() {
	return "fragment_expression";
	}
	@RequestMapping("if-unless")
	public String ifUnless(Model model) {
		User u1=new User("mike","Admin","mike@gmail.com");
		User u2=new User("stalin","Admin","stalin@gmail.com");

		User u3=new User("smith","User","smith@gmail.com");
		List<User>users=new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		model.addAttribute("users", users);
		return "if-unless";
	
	}
	@RequestMapping("/switch-case")
	public String switchCase(Model model) {
		User user=new User("mike","Admin","mike@gmail.com");
		model.addAttribute("user", user);
		return "switch-case";
		
	}
	

}

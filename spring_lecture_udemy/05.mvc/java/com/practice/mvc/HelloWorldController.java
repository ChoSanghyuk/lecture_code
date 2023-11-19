package com.practice.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")		// parent mapping  이 이후 
public class HelloWorldController {

	// need a controller method to show the initial HTMl form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";		// WEB-INF/view/helloworld-form.jsp
	}
	
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {		
		return "helloworld";			// WEB-INF/view/helloworld.jsp
	}
	
	// new a controller method to read form data and add data to the model
	// 모델에 값 넣는 방법1
	@RequestMapping("/processFormVerTwo")
	public String letsShout(HttpServletRequest request , Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Hello " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	// 모델에 값 넣는 방법2
	@RequestMapping("/processFormVerThree")
	public String processFormVerThree( @RequestParam("studentName") String theName , Model model) {
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Hi " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
}

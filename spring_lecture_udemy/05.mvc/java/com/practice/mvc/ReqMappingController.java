package com.practice.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReqMappingController {
	
	@RequestMapping("/showForm")
	public String displayForm() {
		return "ReqMapping";
	}
	
}

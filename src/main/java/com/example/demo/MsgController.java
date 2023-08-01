package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/hai")
	public String msg() {
		return "hai abhishek with jayanth and kiran";
	}

}

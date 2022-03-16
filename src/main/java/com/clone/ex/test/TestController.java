package com.clone.ex.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/text")
	public String text() {
		return "text";
	}
}

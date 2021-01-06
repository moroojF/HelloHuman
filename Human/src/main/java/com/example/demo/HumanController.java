package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HumanController {
	@RequestMapping("/")
    public String index(@RequestParam(value="f_name", required=false) String f_name) {
		if (f_name == null) {
			return "Hello Human!";
		} else {
			return "Hello "+f_name + "!";
		}
    }
}

package com.example.CrudService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class Controller {

	@GetMapping("/getname")
	public String getName() {

		return "My name is Anurag";
	}

}

package edu.escuelaing.MVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.escuelaing.MVC.Services.GreetingService;


@Controller
public class GreetingController {

	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

}

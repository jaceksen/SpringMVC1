package pl.jaceksen.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	
	@RequestMapping
	public String add() {
		System.out.println("Działam ...");
		return "dzialam";
	}

}

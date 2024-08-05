package com.jsp.mcred.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class maincontroler {
	@GetMapping("/")
   public String loadswagger() {
	   return "redirect:/swagger-ui/index.html";
   }
}

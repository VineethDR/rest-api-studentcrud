package com.jsp.mcred.exeption;

import java.net.http.HttpRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class myerrorcontroler implements ErrorController {
	@RequestMapping("/error")
public String error(HttpServletRequest request) {
		int ststes=(int) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		if(ststes==404) {
			return "url not found";
		}else if(ststes==500) {
			return "some thing wrond wrong in code";
		}else if(ststes==405) {
			return "methed not found";
		}else if(ststes==400) {
			return "chick the value";
		}else {
			return "some thing went wrong";
		}
	}
}

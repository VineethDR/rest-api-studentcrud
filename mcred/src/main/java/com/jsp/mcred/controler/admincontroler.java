package com.jsp.mcred.controler;



import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.mcred.dto.admindto;
import com.jsp.mcred.service.adminservice;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/admins")
public class admincontroler {
	@Autowired
	adminservice ads;
	@PostMapping
	@Operation(summary = "save one admin")
	public ResponseEntity<String> insert(@RequestBody admindto  adt) {
		return ads.saveadmin(adt);
	}
	@PostMapping("/mane")
	@Operation(summary = "save all admin")
	public ResponseEntity<String> insertadminall(@RequestBody List<admindto>  ladt) {
		return ads.saveadminall(ladt);
	}
	@GetMapping
	@Operation(summary = "fech all admin")
	public ResponseEntity<List<admindto>> fechall() {
		return ads.fechalladmin();
		
	}
	@GetMapping("/{id}")
	@Operation(summary = "fech by id admin")
	public ResponseEntity<admindto> fechbiid(@PathVariable int id) {
		return ads.fechbyid(id);		
	}
	@GetMapping("/email/{email}")
	@Operation(summary = "fech by email admin")
	public ResponseEntity<List<admindto>> fechadminbyemail(@PathVariable String email) {
		return ads.fechbyemail(email);
		
	}
	@DeleteMapping("/{id}")
	@Operation(summary = "delete id admin")
	public ResponseEntity<String> deletebiid(@PathVariable int id) {
		return ads.deletebyid(id);
	}
	@DeleteMapping
	@Operation(summary = "delete all admin")
	public ResponseEntity<String> deleteall() {
		return ads.deleteall();
	}	
	@PutMapping
	@Operation(summary = "update admin")
	public ResponseEntity<String> update(@RequestBody admindto  adt) {
		return ads.update(adt);
	}
	@GetMapping("/login/{email}/{password}")
	@Operation(summary = "login")
	public ResponseEntity<String> login(@PathVariable String email,@PathVariable String password){
		return ads.findep(email,password);
	}
}

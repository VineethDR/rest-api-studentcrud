package com.jsp.mcred.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.mcred.dto.admindto;
import com.jsp.mcred.exeption.myexeptionhandler;
import com.jsp.mcred.repsotary.adminsreposetru;
@Component
public class adminservice {
	@Autowired
	adminsreposetru adre;
	
	public ResponseEntity<String> saveadmin(admindto dto) {
		adre.save(dto);
		return new ResponseEntity<String>("data saved",HttpStatus.CREATED);
	}
	public ResponseEntity<String> saveadminall(List<admindto> dto) {
		adre.saveAll(dto);
		return new ResponseEntity<String>("all data saved",HttpStatus.CREATED);
	}
	public ResponseEntity<List<admindto>> fechalladmin() {
		List<admindto> lis=adre.findAll();
		if(lis.isEmpty()) {
			throw new myexeptionhandler("data not found");
		}else {
			return new ResponseEntity<List<admindto>>( lis,HttpStatus.FOUND);
		}
	}
	public  ResponseEntity<admindto> fechbyid(int id) {
		admindto ais=adre.findById(id).orElseThrow(()->new myexeptionhandler("id not found "+id));
			return new ResponseEntity<admindto>( ais,HttpStatus.FOUND);
	}
	public ResponseEntity<List<admindto>> fechbyemail(String email) {
		List<admindto> elis=adre.findByEmail(email);
		if(elis.isEmpty()) {
			throw new myexeptionhandler("data not found");
		}else {
			return new ResponseEntity<List<admindto>>( elis,HttpStatus.FOUND);
		}
	}
	public ResponseEntity<String> deletebyid(int id) {
		admindto ais=adre.findById(id).orElseThrow(()->new myexeptionhandler("id not found "+id));
				 adre.deleteById(id);
				 return new ResponseEntity<String>("data deleted",HttpStatus.OK);
		}
	public ResponseEntity<String> deleteall() {
		adre.deleteAll();
		return new ResponseEntity<String>("data all deleted",HttpStatus.OK);
	}
	public ResponseEntity<String> update(admindto adt) {
		adre.save(adt);
		return new ResponseEntity<String>("data updated succesfully",HttpStatus.OK);
	}
	public ResponseEntity<String> findep(String email, String password) {
	List<admindto> ep=adre.findByEmailAndPassword(email,password);
		if(email.isEmpty()) {
			return new ResponseEntity<String>("in valed login",HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<String>("valed login",HttpStatus.FOUND);
		}
	}
	 }

package com.jsp.mcred.repsotary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.mcred.dto.admindto;

public interface adminsreposetru extends JpaRepository<admindto, Integer> {

	List<admindto> findByEmail(String email);

	List<admindto> findByEmailAndPassword(String email, String password);

}

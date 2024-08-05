package com.jsp.mcred.exeption;

public class myexeptionhandler extends RuntimeException {
String message="data not found";

public String getMessage() {
	return message;
}

public myexeptionhandler(String message) {
	super();
	this.message = message;
}

public myexeptionhandler() {
	
}

}

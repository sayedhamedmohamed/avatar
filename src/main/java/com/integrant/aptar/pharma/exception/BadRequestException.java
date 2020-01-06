package com.integrant.aptar.pharma.exception;

public class BadRequestException extends IntegrantAptarPharmaException{

	   private static final long serialVersionUID = 1;

	    public BadRequestException(Integer code) {
	        super(400, "Invalid user Input");
	    }
}

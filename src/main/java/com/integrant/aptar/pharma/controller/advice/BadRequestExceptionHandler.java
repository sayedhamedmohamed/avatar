package com.integrant.aptar.pharma.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.integrant.aptar.pharma.exception.BadRequestException;

@ControllerAdvice
public class BadRequestExceptionHandler {
	/**
	 * Handle bad request exception.
	 *
	 * @param ex the ex
	 * @param request the request
	 * @return the response entity
	 */
	@ExceptionHandler(BadRequestException.class)
	public final ResponseEntity<Object> handleBadRequestException(BadRequestException ex, WebRequest request) {

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
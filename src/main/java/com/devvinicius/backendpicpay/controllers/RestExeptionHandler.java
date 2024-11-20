package com.devvinicius.backendpicpay.controllers;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.devvinicius.backendpicpay.exceptions.PicPayException;

@RestControllerAdvice
public class RestExeptionHandler {

	
	@ExceptionHandler(PicPayException.class)
	public ProblemDetail handlePicPayException(PicPayException e) {
		return e.toProblemDetail();
	}
}

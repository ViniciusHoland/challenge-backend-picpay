package com.devvinicius.backendpicpay.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class WalletDataAlreadyExistsException extends PicPayException{

	private String detail;
	
	
	
	public WalletDataAlreadyExistsException(String detail) {
		super();
		this.detail = detail;
	}



	@Override
	public ProblemDetail toProblemDetail() {
		var pb = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);
		
		pb.setTitle("wallet data already exists");
		pb.setDetail(detail);
		
		return pb;
	}

	
	
	
	
}

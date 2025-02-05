package com.example.demo.exceptions;

import java.time.LocalDateTime;

import javax.persistence.NoResultException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AllExceptionHandler 
{
	
	
	public AllExceptionHandler() {
		System.out.println("--->> Inside Controller Advice ");
	}

	@ExceptionHandler
	public ResponseEntity<ExceptionTemplate> handleIllegalArgumentExceptionTemplateData(IllegalArgumentException e)
	{
		ExceptionTemplate template = new ExceptionTemplate();
		template.setMsg(e.getMessage());
		template.setUserInput("");
		template.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ExceptionTemplate> handleNoSuchElementExceptionTemplateData(java.util.NoSuchElementException e)
	{
		System.out.println("--->> Inside Exeption Handler : Invalid Id ");
		ExceptionTemplate template = new ExceptionTemplate();
		template.setMsg(e.getMessage());
		template.setUserInput("");
		template.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<ExceptionTemplate> handleNullPointerExceptionTemplateData(NullPointerException e)
	{
		System.out.println("--->> Inside Exeption Handler : Null ");
		ExceptionTemplate template = new ExceptionTemplate();
		template.setMsg(e.getMessage());
		template.setUserInput(e.toString());
		template.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ExceptionTemplate> handleNoResultExceptionTemplateData(NoResultException e)
	{
		System.out.println("--->> Inside Exeption Handler : NoResultException ");
		ExceptionTemplate template = new ExceptionTemplate();
		template.setMsg(e.getMessage());
		template.setUserInput("");
		template.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler		
	public ResponseEntity<ExceptionTemplate> handleInvalidPincodeExceptionTemplateData(InvalidPinCodeException e)	{
		
		ExceptionTemplate template = new ExceptionTemplate();
		template.setMsg("Invalid pincode");
		template.setUserInput(e.toString());
		template.setDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	

}

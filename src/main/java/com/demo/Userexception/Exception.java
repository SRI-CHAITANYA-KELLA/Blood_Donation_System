package com.demo.Userexception;

public class Exception extends RuntimeException{
	private String exception;

	public Exception() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exception(String exception) {
		super();
		this.exception = exception;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	@Override
	public String toString() {
		return "Exception [exception=" + exception + "]";
	}
	
	
	
}

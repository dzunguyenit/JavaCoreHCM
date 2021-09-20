package com.lession.lession16;

public class AgeCheckingException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeCheckingException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Tuổi phải từ 18 trở lên.";
	}
}

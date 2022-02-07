package ExceptionPassword;

public class ExceptionPassword extends Exception {

	private int exceptionCode;
	
	public ExceptionPassword(int code) {
		super();
		this.exceptionCode = code;
	}
	
	public ExceptionPassword() {}
	
	public String getMessage() {
		String message = " ";
		switch(exceptionCode) {
			
		}
		
		return message;
	}
	
}

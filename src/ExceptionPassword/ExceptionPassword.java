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
			case 1:
				message = "La longitud m�nima es de 8 car�cteres";
			case 2:
				message = "";
		}
		
		return message;
	}
	
}

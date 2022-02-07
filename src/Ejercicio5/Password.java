package Ejercicio5;

public class Password {
	private String password;
	private int longitud;
	private final String MAYUSCULAS = "ABCDEFGHIJKLMNÑOPQRSTVWXYZ";
	private final String MINUSCULAS = "abcdefghijklmnñopqrstvwxyz";
	//private final int NUMEROS = "1234567890";
	
	// DEFECTO
	public Password() {
		this.password = "";
		this.longitud = 8;
	}
	
	public Password(int longi) {
		this.longitud = longi;
	}
	
	
	
}

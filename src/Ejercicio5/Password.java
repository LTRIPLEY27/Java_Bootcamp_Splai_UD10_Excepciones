package Ejercicio5;

import java.util.ArrayList;

public class Password {
	private String password;
	private int longitud;
	private final String NUM_MAYUS_MINUS = "abcdefghijklmnñopqrstvwxyzABCDEFGHIJKLMNÑOPQRSTVWXYZ1234567890";
	//private final String MINUSCULAS = "abcdefghijklmnñopqrstvwxyz";
	//private final int NUMEROS = "1234567890";
	
	// DEFECTO
	public Password() {
		this.password = "";
		this.longitud = 8;
	}
	// CONSTRUCTOR QUE ACTUALIZA LA LONGITUD
	public Password(int longi) {
		this.longitud = longi;
	}
	
	public void createPassword() {
		ArrayList <Character> letter = new ArrayList<Character>();
		char [] aux = new char[this.longitud];
		for(int i = 0; i < this.longitud; i++) {
			aux[i] = NUM_MAYUS_MINUS.charAt(i);
			//letter.add(aux);
		}
		
		this.password = new String(aux);
	}
	public String getPassword() {
		return password;
	}

	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
}

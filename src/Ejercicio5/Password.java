package Ejercicio5;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class Password {
	private String password;
	private int longitud;
	private final String NUM_MAYUS_MINUS = "abcdefghijklmn�opqrstvwxyzABCDEFGHIJKLMN�OPQRSTVWXYZ1234567890�!@#$%&/()=?�*-+.,{}";
	// DEFECTO
	public Password() {
		this.password = "";
		this.longitud = 7;
	}
	
	// CONSTRUCTOR QUE ACTUALIZA LA LONGITUD
		public Password(int longi) {
			this.longitud = longi;
		}
		
	
	public void createPassword() {
		char [] aux = new char[this.longitud];//ARRAY DE CHARS QUE ALMACENARAN LOS VALORES A ITERAR RANDOM
		Random rand = new Random(); // INSTANCIAMOS LA CLASE RANDOM PARA OBTENER VALORES ALEATORIOS EN CADA ITERACION
		for(int i = 0; i < this.longitud; i++) {
			
			aux[i] = NUM_MAYUS_MINUS.charAt(rand.nextInt(NUM_MAYUS_MINUS.length()));// RETORNA UN N�MERO RANDOM DENTRO DE LA LONGITUD DEL STRING, CON EL CHAR AT RETORNA LA LETRA ESPEC�FICA DE ESE RANDOM Y CON EL CHAR ARRAY VA ALMACENANDO LOS M�LTIPLES CARACTERES PARA RETORNAR EL STRING
			}
		this.password = new String(aux);// RETORNA EL ARRAY DE CHARS QUE ALMACEN� TODOS LOS VALORES RANDOM Y LOS CONVIERTE EN UN STRING INSTANCIANDO LA CLASE
	}
	
	//M�TODO GETPASSWORD
	public String getPassword() {
		return password;
	}
//GETTERS Y DETTERS DE LONGITUD
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public boolean esFuerte() {
		String regexVerified = "[A-Z]{2}[a-z]{1}\\d{5}";//MAYUSCULAS =2 O M�S, MIN�SCULAS = 1 O M�S, D�GITOS = 5 O M�S
		if(this.password.matches(regexVerified)) {
			return true;
		} 
		return false;
	}
	
}

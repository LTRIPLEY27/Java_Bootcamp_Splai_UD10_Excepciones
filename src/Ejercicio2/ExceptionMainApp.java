package Ejercicio2;

import java.util.Scanner;

/*
 * @autor : Isabel C.
 * Ejercicio 2: UD10, Excepción personalizad
 * */
import CustomException.ExceptionClass;

public class ExceptionMainApp {

	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("indique numero");
		int num = ask.nextInt();

		try {	
			//LAS EXCEPCIONES CAPTURADAS CON TERNARIO SE LLAMAN DIRECTAMENTE DESDE EL THROW Y CONDICIONADO LA RESPUESTA 
			throw ((num % 2 == 0) ?  new ExceptionClass(1) : new ExceptionClass(2));
		} catch (ExceptionClass ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}

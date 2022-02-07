package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controler {
	
	public static void startProgram() {
		Scanner ask = new Scanner(System.in);
		String [] opciones = {"1. Suma", "2. Resta", "3. Multiplicación", "4. División", "5. Raiz cuadrada", "6. Raiz cúbica", "7. Salir"};
		System.out.println("\nIngrese número de la opción");
		for(int i = 0; i < opciones.length; i++) {
			System.out.println(opciones[i]);
		}
		
		try {
			int response = ask.nextInt();
		if(response != 7) {
			do {
				//try {
					System.out.println("ingrese num1");
					int num1 = ask.nextInt();
					
					System.out.println("ingrese num2");
					int num2 = ask.nextInt();
					Calculate calcula = new Calculate(num1, num2);
					switch (response) {
						case 1:
							calcula.makeSum();
							break;
						case 2:
							calcula.makeSubtract();
							break;	
						case 3:
							calcula.makeMultiply();
							break;
						case 4:
							calcula.makeDivision();
							break;
						case 5:
							calcula.makeSQRT();
							break;
						case 6:
							calcula.makeCBRT();
							break;
					}
					
					System.out.println("\nIngrese número de la opción");
					for(int i = 0; i < opciones.length; i++) {
						System.out.println(opciones[i]);
					}
					response = ask.nextInt();
			}while(response != 7);
				System.out.println("Adeu ");
		} else {
			System.out.println("Adeu ");
		}
	}catch(InputMismatchException ex) {
		System.out.println("Excepcion " + ex.getMessage() + " Debe de ingresar un valor válido");
		//break;
		}
	}
	
}

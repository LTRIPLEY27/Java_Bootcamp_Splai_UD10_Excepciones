package Ejercicio4;

import java.util.Scanner;

public class Calculate {
	private int numberA;
	private int numberB;
	private int total;
	private double calculaSQRT;
	
	public Calculate() {
		this.numberA = 0;
		this.numberB = 0;
		this.total = 0;
		this.calculaSQRT = 0.0;
	}
	
	public Calculate(int valorA, int valorB) {
		this.numberA = valorA;
		this.numberB = valorB;
	}

	public double getCalculaSQRT() {
		return calculaSQRT;
	}

	public void setCalculaSQRT(double calculaSQRT) {
		this.calculaSQRT = calculaSQRT;
	}

	public int getNumberA() {
		return numberA;
	}

	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}

	public int getNumberB() {
		return numberB;
	}

	public void setNumberB(int  numberB) {
		this.numberB = numberB;
	}
	
	public void makeSubtract() {
		this.total = numberA - numberB;
		System.out.println("La resta es igual a " + this.total);
	}
	
	public void makeSum() {
		this.total = numberA + numberB;
		System.out.println("La suma es igual a " + this.total);
	}
	
	public void makeMultiply() {
		this.total = numberA * numberB;
		System.out.println("La multiplicacion es igual a " + this.total);
	}
	
	public void makePow() {
		this.total = (int) Math.pow(numberA, numberB);
		System.out.println("La multiplicacion es igual a " + this.total);
	}
	
	public void makeDivision() {
		// LA EXCEPCION DIVIDED BY ZERO SE EJECUTA ÚNICAMENTE CON ENTEROS, YA QUE CON VALORES DOUBLE NO LA RECONOCE
		try {
			this.total = numberA / numberB;
			System.out.println("La división es igual a " + this.total);
		}catch(ArithmeticException ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void makeSQRT() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique valor");
		double value = ask.nextDouble();
		this.calculaSQRT = Math.sqrt(value);
		System.out.println("La raiz cuadrada es igual a " + this.calculaSQRT);
	}
	
	public void makeCBRT() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique valor");
		double value = ask.nextDouble();
		this.calculaSQRT = Math.cbrt(value);
		System.out.println("La raiz cúbica es igual a " + this.calculaSQRT);
	}
	
}

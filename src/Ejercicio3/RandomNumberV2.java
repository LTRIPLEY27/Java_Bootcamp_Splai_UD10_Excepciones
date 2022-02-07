package Ejercicio3;

import CustomException.ExceptionClass;

public class RandomNumberV2 {
	
	private int number;
	private final int MINIMO = 0;
	private final int MAXIMO = 999;
	
	public RandomNumberV2() {
		this.number = 0;
	}
	
	public void setNumber() {
		System.out.println("Generando n�mero aleatorio");
		this.number = (int) (Math.random() * (MAXIMO - MINIMO));
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void verificaImpar() {
		System.out.println("El n�mero aleatorio es : " + this.number);
		try {
		throw this.number % 2 == 0 ? new ExceptionClass(1) : new ExceptionClass(2);
		} catch(ExceptionClass ex) {
			System.out.println(ex.getMessage());
		}
	}
}

package Ejercicio5;

public class PasswordApp {

	public static void main(String[] args) {
		Password pass = new Password(10);
		


		pass.createPassword();
		System.out.println(pass.getPassword());
		System.out.println(pass.esFuerte());
	
	}

}

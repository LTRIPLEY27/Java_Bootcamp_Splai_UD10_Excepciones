package Ejercicio5;

public class PasswordApp {

	public static void main(String[] args) {
		Password pass = new Password(9);
		
		pass.createPassword();
		pass.getPassword();
		System.out.println(pass.getPassword());
	}

}

package senati;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = scn.nextLine();
		
		for (int x = 1; x <= 10; x++)
			System.out.println(x + ". Bienvenido " + nombre + " al curso");
		
		for (int i = 10; i >= 0; i -=2)
			System.out.println(i);
		
		
	}

}

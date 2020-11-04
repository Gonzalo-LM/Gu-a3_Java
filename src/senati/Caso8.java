package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int numero = scn.nextInt();
		
		System.out.println("\nTabla de Multiplicar del " + numero);
		System.out.println("==============================");
		
		
		for (int i = 1; i <= 15; i++)
			System.out.println(numero + " x " + i + " = " + (i * numero));
	}

}

package senati;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = 0, i = 1, num_mayor = 0;
		
		while (i <= 4) {
			System.out.print("Ingrese número " + i + ": ");
			n = scn.nextInt();
			
			if (n > num_mayor) num_mayor = n;
			
			i++;
		}
		System.out.println("El número mayor es: " + num_mayor);
	}
}

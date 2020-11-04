package senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = scn.nextInt();
		
		int i = 1, suma = 0, a = 1, b = 1;
		String c = null;
		
		while (i <= n) {
			suma += i;
			c = " + ";
			if (a <= i)
			    System.out.print(a);
			    a++;
			if (b < n)
			    System.out.print(c);
			    b++;
			i++;
		}
		System.out.print(" = " + suma);
		System.out.println("\nRESULTADOS");
		System.out.println("==========");
		System.out.println("La sumatoria de " + n + " es: " + suma);
	}

}

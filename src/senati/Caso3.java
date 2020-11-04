package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = scn.nextInt();
		
		int i = 1, a = 1, b = 1, prod = 1;
		String c = null;
		
		if (n > 7) {
			System.out.println("El número es superior de 7");
		}else {
			while (i <= n) {
				prod = prod * i;
				c = " * ";
				if (a <= i)
				    System.out.print(a);
				    a++;
				if (b < n)
				    System.out.print(c);
				    b++;
				i++;
			}
			System.out.print(" = " + prod);
			System.out.println("\nRESULTADOS");
			System.out.println("==========");
			System.out.println("El factorial de " + n + " es: " + prod);
		}
	}

}

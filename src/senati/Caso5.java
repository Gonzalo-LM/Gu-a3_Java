package senati;

import java.util.Scanner;

public class Caso5 {

  public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  
  int n = 0, i = 2, n_men = 0;
  
  System.out.print("Ingrese número 1: ");
  n = scn.nextInt();
  
  n_men = n;
  
  while (i <= 5) {
    
    System.out.print("Ingrese número " + i + ": ");
    n = scn.nextInt();
    
    if (n < n_men){
      n_men = n;
    }
    i++;
  }
  System.out.println("El número menor es: " + n_men);
  }
}

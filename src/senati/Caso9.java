package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		 
		String nombre = "", otro = "S", est = "", nom_M = "", nom_m = "";
		int n1 = 0, n2 = 0, n3 = 0, reg = 0, na = 0,
				cc = 0, sc= 0;
		float prom = 0, x = 0, asistencia = 0, num_may = 0, num_men = 0;
		  
		while (otro.equals("S") || otro.equals("s")){
			reg++;
			  
		    System.out.println("=============");
		    System.out.println("Registro " + reg + ": ");
		    System.out.println("=============");
		   
		    System.out.print("Nombre de alumno: ");
		    nombre = scn.nextLine();
		    na++;
		   
		    System.out.print("Nota 1: ");
		    n1 = scn.nextInt();
		   
		    System.out.print("Nota 2: ");
		    n2 = scn.nextInt();
		   
		    System.out.print("Nota 3: ");
		    n3 = scn.nextInt();
		   
		    System.out.print("Asistencia [1-12]: ");
		    asistencia = scn.nextFloat();
		      
		    prom = (n1 * 0.2f) + (n2 * 0.3f) + (n3 * 0.5f);
		    x = (asistencia * 100) / 12;
		  
		    if ((prom > 13 && x > 70)){
		      est = "Obtiene certificado";
		      cc++;
		    }else{
	 	     est = "Sin certificado";
		      sc++;
		    } 
		    
		    if (num_men == 0) {
		    	num_men = prom;
		        nom_m = nombre;
		        num_may = prom;
		        nom_M = nombre;
		    }else
		    	if (prom < num_men) {
		    		num_men = prom;
		    		nom_m = nombre;
		    	}
		    	if (prom > num_may) {
		    		num_may = prom;
			        nom_M = nombre;
		    	}
		    
		    System.out.println("===============");
		    System.out.println("===Resultado===");
	  	    System.out.println("===============");
	 	    System.out.println("Promedio: " + prom);
		    System.out.println("Asistencia: " + df.format(x) + "%");
		    System.out.println("Estado: " + est);
		  
		    scn.nextLine();
		  
		    System.out.print("¿Registrar otro? [S/N]: ");
		    otro = scn.nextLine();
		    
		    while (!otro.equals("S") && !otro.equals("s") && !otro.equals("N") && !otro.equals("n")) {
		    	System.out.println("Debe ingresar solo S o N");
		    	System.out.print("¿Registrar otro? [S/N]: ");
			    otro = scn.nextLine();
		    }
		    	
		    if (otro.equals("N") || otro.equals("n")) {
		    	System.out.println("===============");
			    System.out.println("====Resumen====");
			    System.out.println("===============");
			    System.out.println("Número de alumnos: " + na);
			    System.out.println("Mayor promedio: " + num_may +
			      		" pertenece a: " + nom_M);
			    System.out.println("Menor promedio: " + num_men +
			    		" pertenece a: " + nom_m);
			    System.out.println("Número de alumnos certificados: " + cc);
			    System.out.println("Número de alumnos sin certificado: " + sc);
			  }
		   }
	   }
	}

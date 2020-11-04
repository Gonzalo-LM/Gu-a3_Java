package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String empleado = "", otro = "S", nom_M = "", nom_m = "";
		int tarifa = 0, min = 0, reg = 0, ne = 0, meta = 0, min_may = 0;
		float ht = 0, bono = 0, dscto = 0, sn = 0, x = 0, num_may = 0, num_men = 0, sb = 0;
		
		while (otro.equals("S") || otro.equals("s")){
			reg++;
			
			System.out.println("=============");
			System.out.println("Registro de Empleados (" + reg + ")");
			System.out.println("=============");
			
			System.out.print("Empleado: ");
			empleado = scn.nextLine();
			ne++;
			
			System.out.print("Horas trabajadas: ");
			ht = scn.nextInt();
			
			System.out.print("Tarifa por hora: ");
			tarifa = scn.nextInt();
			
			System.out.print("Minutos de tardanza: ");
			min = scn.nextInt();
			
			sb = ht * tarifa;
			
			if (ht < 50)
				bono = 0;
			else if (ht > 50 && ht <= 60)
				bono = 0.02f * sb;
			else if (ht > 60 && ht <= 70)
				bono = 0.08f * sb;
			else if (ht > 70 && ht <= 80)
				bono = 0.13f * sb;
			else if (ht > 80)
				bono = 0.15f * sb;
			
			if (min <= 15)
				dscto = 0;
			else if (min > 15 && min <= 30)
				dscto = 0.003f * sb * min;
			else if (min > 30)
				dscto = 0.005f * sb * min;
			
			sn = (sb + bono) - dscto;
			x = (ht * 100) / 80;
			
			if (x > 90)
				meta++;
			
			if (num_men == 0) {
		    	num_men = sn;
		        nom_m = empleado;
		        num_may = sn;
		        nom_M = empleado;
		    }else
		    	if (sn < num_men) {
		    		num_men = sn;
		    		nom_m = empleado;
		    	}
		    	if (sn > num_may) {
		    		num_may = sn;
			        nom_M = empleado;
		    	}
		    	
		    if (min > min_may) {
		    	min_may = min;
		    	nom_m = empleado;
		    }
			
		    System.out.println("===============");
		    System.out.println("===Resultado===");
	  	    System.out.println("===============");
	  	    System.out.println("Sueldo bruto: " + df.format(sb));
	  	    System.out.println("Bonificación: " + df.format(bono));
	  	    System.out.println("Descuento: " + dscto);
	  	    System.out.println("Sueldo neto: " + df.format(sn));
	  	    System.out.println("% Alcanzado: " + x + "%");
		    
			scn.nextLine();
			  
		    System.out.print("¿Nuevo empleado? [S/N]: ");
		    otro = scn.nextLine();
		    
		    while (!otro.equals("S") && !otro.equals("s") && !otro.equals("N") && !otro.equals("n")) {
		    	System.out.println("Debe ingresar solo S o N");
		    	System.out.print("¿Nuevo empleado? [S/N]: ");
			    otro = scn.nextLine();
		    }
		    
		    if (otro.equals("N") || otro.equals("n")) {
		    	
		    	System.out.println("===============");
			    System.out.println("====Resumen====");
			    System.out.println("===============");
			    System.out.println("Número de empleado: " + ne);
			    System.out.println("Sueldo neto mayor: " + num_may +
			      		" pertenece a: " + nom_M);
			    System.out.println("Menor promedio: " + num_men +
			    		" pertenece a: " + nom_m);
			    System.out.println("Empleado con la mayor cantidad de minutos"
			    		+ " de tardanza: " + nom_m + " (" + min_may + " min.)");
			    System.out.println("Cantidad de empleados con más del 90% de "
			    		+ "la meta: " + meta);
		    }
		}
	}
}
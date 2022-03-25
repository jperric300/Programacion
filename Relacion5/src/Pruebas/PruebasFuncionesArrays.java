package Pruebas;

import java.util.Scanner;

public class PruebasFuncionesArrays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//CREAR ARRAYS
		 System.out.println("Crear array");
		 System.out.println();
		 System.out.println();
		 System.out.println("Dime la dimension del array");
			int dim = s.nextInt();
			
			 System.out.println("Dime el numero minimo que quieras que aparezca");
				int min = s.nextInt();

		 System.out.println("Dime el numero maximo que quieras que aparezca");
			int max = s.nextInt();

	
			
			int[] ARRAY = Funciones.FuncionesArrays.Array(dim,min,max);

		
	}

}

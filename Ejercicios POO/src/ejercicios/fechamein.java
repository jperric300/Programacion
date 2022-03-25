package ejercicios;

import java.util.Scanner;

public class fechamein {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Ejercicio 1

//	 Crea el objeto utilizando el constructor por defecto

		fecha fecha1 = new fecha();

//	Asigna los datos pedidos por teclado.

		System.out.println("Dime un dia");
		fecha1.setDia(s.nextInt());

		System.out.println();

		System.out.println("Dime un mes");
		fecha1.setMes(s.nextInt());

		System.out.println();

		System.out.println("Dime un año");
		fecha1.setAño(s.nextInt());

		System.out.println();

		
		// Ejercicio 2
		
		//Crea el objeto utilizando el constructor con parámetros
		
		fecha fecha2  = new fecha(1, 2 , 2020);

		
	//Ejercicio 3	Si la fecha es correcta se muestra utilizando el método toString()
		
		System.out.println("primera forma");
		System.out.println(fecha1);
		System.out.println(fecha2);
		
		
		System.out.println("segunda forma");

		System.out.println(fecha1.toString());
		System.out.println(fecha2.toString());

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//Ejercicio 4 Se muestran los 10 días siguientes utilizando el método diaSiguiente()  
	System.out.println("Muestra de los 10 dias siguientes");
	System.out.println();
	
		for (int i = 1; i <= 10; i++) {
			fecha1.diaSiguiente();
			//fecha2.diaSiguiente();
			System.out.println(fecha1.toString());
			//System.out.println(fecha2.toString());
		}
		
		
		
	}

}

package relación1;

/*Crea las variables nombre, direccion y telefono y asígnale los valores correspondientes.
 Muestra los valores de esas variables por pantalla de tal forma que el resultado del programa
sea el mismo que en el ejercicio 2.*/

import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		String nombre=sn.nextLine();
		System.out.println("Tu nombre es " + nombre);
		
		System.out.println("Escribe tu dirección");
		String dirección=sn.nextLine();
		System.out.println("Tu dirección es " + dirección);
		
		System.out.println("Escribe tu telefono");
		String telefono=sn.nextLine();
		System.out.println("Tu telefono es " + telefono);
				
	}

}

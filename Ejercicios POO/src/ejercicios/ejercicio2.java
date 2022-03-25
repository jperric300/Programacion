package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Cuenta1 introduce datos");
		System.out.println("");
		
		//creacion de objeto
		Cuenta c1 = new Cuenta();
		System.out.println("Escribe el nombre de tu cuenta");
		c1.setNombre(s.nextLine());
		
		System.out.println("Escribe el Numero de Cuenta");
		c1.setNumero_de_cuenta(s.nextLine());
		
		System.out.println("Escribe el tipo de interes");
		c1.setTipo_de_interes(s.nextDouble());

		System.out.println("Escribe el saldo de tu cuenta");
		c1.setSaldo(s.nextDouble());


		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Datos de la cuenta 1");
		c1.mostrardatos();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Datos de la cuenta 2");
		Cuenta c2 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);
		

		c2.mostrardatos();
		
		System.out.println();
		System.out.println();
		System.out.println("Datos de la cuenta 3 copia de la 2");
		Cuenta c3 =new Cuenta(c2);
		c3.mostrardatos();

	}
}

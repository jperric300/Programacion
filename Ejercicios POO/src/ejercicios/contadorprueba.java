package ejercicios;

import java.util.Scanner;

public class contadorprueba {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		
		//1
		
		//creacion de objeto
		Contador c1 = new Contador(33);
		System.out.println("El c1 tiene un valor de "+c1.getCont());

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		//2
		Contador c2 = new Contador();
		System.out.println("Contador");
		
		c2.setCont(s.nextInt());
		System.out.println("El c2 tiene un valor de "+c2.getCont());
	
		System.out.println();
		System.out.println();
		System.out.println();
		
		//3
		
		c1.incremento();	

		
		//4
		
        System.out.println("el valor de incrementar 1 vez " +c1.getCont());

		
		//5
		c1.incremento();	

		c1.incremento();	

		
		//6
		
        System.out.println("el valor de incrementar 2 veces " +c1.getCont());

		
		//7
		
		c1.decremento();	

		
		//8
        System.out.println("decremento en 1 " +c1.getCont());

		
		
		//9
		Contador c3 = new Contador(10);
		System.out.println("El c3 tiene un valor de "+c1.getCont());

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		//10
		c3.incremento();	
		c3.incremento();
        System.out.println("incremento en 2 " +c3.getCont());

		
		
		c3.decremento();	
		c3.decremento();
        System.out.println("decremento en 2 " +c3.getCont());

		
		//11
        Contador c4 = new Contador();
		
		
		//12
        Contador c5 = new Contador(c3);

		
		
		//13
        System.out.println("El constructor copia de 3 es " +c5.getCont());

		
		
		
		
		
		
		
		
		
		
		
	}

}

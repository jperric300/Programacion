package relaciones2;

import java.util.Scanner;

public class relacion2_14 {

	public static void main(String[] args) {
		/* Escribe un programa que pida una base y un exponente (entero positivo)
		*y que calcule la potencia*/
		
		Scanner sn = new Scanner(System .in);
		
		int base;
		int exponente;
		int potencia;
		
		System.out.println("Dime la base de un numero");
		base=sn.nextInt();
		
		System.out.println("Dime el exponente del numero");
		exponente=sn.nextInt();
		
		if (exponente>=0) {
		System.out.println("la potencia es " + Math.pow(base, exponente	));
		
			} else {
					System.out.println("El numero del exponente es negativo y no es válido");
					}
		}

	}



package relaciones2;

import java.util.Scanner;

public class relacion2_21 {

	public static void main(String[] args) {
	
		Scanner sn = new Scanner(System .in);
		int num=0;
		int cont=0;
		int contimpares=0;
		int pares;
		int impares;
		int resto;
		int esmayor=0;
		int acumulador=0;
		do {
			System.out.println("Dime un número");
			num=sn.nextInt();	
			cont=(cont+1);
			
			
			if(num%2==0) {
				if (num>esmayor) {
					esmayor=num;
				}
			} else { 
				acumulador=acumulador+num;
				contimpares++;
			}
				
		
			
		}while(num>=0);
		
		System.out.println("se han introducido " +cont +" numeros");
		System.out.println("el numero par mayor es " +esmayor);
		System.out.println("la media de los impares es "+(acumulador/contimpares));
		
		}
	}



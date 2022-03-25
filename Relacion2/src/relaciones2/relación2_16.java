package relaciones2;

import java.util.Scanner;

public class relación2_16 {

	public static void main(String[] args) {
	
		/*Escribe un programa que diga si un número introducido por teclado es o no primo.
		 *Un número primo es aquel que sólo es divisible entre él mismo y la unidad.*/
		
		Scanner sn = new Scanner(System .in);
		
	
		int num;
		//boolean primo=true;
		int con_div=0;
		
		System.out.println("Introduce un numero");
		num=sn.nextInt();
		
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				//primo=false;
				con_div++;
				}
			
		}
		if(con_div==0) {
			System.out.println("el numero es primo");
		}else
		{ 
			System.out.println("el numero NO es primo");

		}
			
			
		}
		
		
		
	}

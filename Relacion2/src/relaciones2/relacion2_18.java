package relaciones2;

import java.util.Scanner;

public class relacion2_18 {

	public static void main(String[] args) {
	
	/*	Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por 
		teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir 
		incrementando de 7 en 7.*/
		
		int a;
		int b;
		
		Scanner sn = new Scanner(System .in);
	do {
		System.out.println("Dime un numero");
		a=sn.nextInt();
		
		System.out.println("Dime otro numero");
		b=sn.nextInt();
	}while (a==b);
		
		if(a<b) {
		for (int i = a; i <= b; i=(i+7)) {
			System.out.println(i);
		}
				}
			
		else{
			for (int i = b; i <= a; i=(i+7)) {
				System.out.println(i);
			}
					}
	}}
		
		
		
		
	


package relaciones2;

import java.util.Scanner;

public class relacion2_13 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System .in);
		
		int cont=0;
		int positivo=0; 
		int negativo=0;
		int num;
		
		System.out.println("escribe un numero");
		
		for (cont =1; cont<=10; cont++) {
			
			num=sn.nextInt();

			if (num>0)
			{
				positivo=(positivo+1);
			}
			else {
					negativo=(negativo+1) ;
			}
			
		}
		
		
		System.out.println("De los numeros elegidos " +positivo +" son positivos y " +negativo +" son negativos");
		
		
		{
			}
		
		
		
	}}



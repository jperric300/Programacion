package relaciones2;

import java.util.Scanner;

public class relacion2_9 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System .in);
		
		
		
		System.out.println("Escribe un número por pantalla");
	
		int num=sn.nextInt();
		
		int cont=0;
				
		while (num>0)
		
		{ 
			num=num/10;
			cont=cont+1;
		}
		
		System.out.print("tu numero tiene " +cont +" digito");
			
		
	}

}

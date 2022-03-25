package relaciones2;

import java.util.Scanner;

public class relación2_10 {

	public static void main(String[] args) {
		
	Scanner sn = new Scanner(System .in);
	
	int num=0;
	int cont=0;
	int acum=0;
	
	while (num>=0)
		
	{System.out.println("introduduce un numero");
	
	if(num>=0)
	num=sn.nextInt();
	cont=cont+1;
	acum=acum+num;
	}
	
	System.out.println("su media es " +(acum-num)/(cont-1));
	
	
	}
}



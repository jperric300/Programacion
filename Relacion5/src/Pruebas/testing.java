package Pruebas;

import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("PosDigitos");

		System.out.println("Dime un numero");
		int numdig = s.nextInt();
		
		System.out.println("Elige un digito ");
		int  digele = s.nextInt();

		int PosDigi = Funciones.funciones.posDigitos(numdig,digele);

System.out.println(PosDigi);
		
}
}

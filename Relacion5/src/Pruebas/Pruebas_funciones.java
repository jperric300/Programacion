package Pruebas;

import java.util.Scanner;

public class Pruebas_funciones {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// comprobar primo
		System.out.println("Comprobar Primo");
		System.out.println("Dame un número");
		int n = s.nextInt();

		boolean primo = Funciones.funciones.esprimo(n);

		if (primo == true) {
			System.out.println("es primo");
		} else {
			System.out.println("no es primo");
		}

		System.out.println();
		System.out.println();

		// compraobar potencia
		System.out.println("Comprobar Potencia");

		System.out.println("Dame la base de un número");
		int base = s.nextInt();

		System.out.println("Dame el exponente de un número");
		int exponente = s.nextInt();

		int potencia = Funciones.funciones.potencia(base, exponente);

		System.out.println();
		System.out.println();

//comprobar digitos 
		System.out.println("Comprobar digitos");

		System.out.println("Dame un número");
		int numero = s.nextInt();

		int digitos = Funciones.funciones.digitos(numero);

		System.out.println("El numero tiene " + digitos + " dígitos");
		System.out.println();
		System.out.println();

//Le da la vuelta a un numero
		System.out.println("voltea un numero");

		System.out.println("Dame un número sin invertir");
		int numerosininvertir = s.nextInt();

		int voltea = Funciones.funciones.voltea(numerosininvertir);

		System.out.println(voltea);

		System.out.println();
		System.out.println();

//Primer Primo

		System.out.println("Primer Primo");

		System.out.println("Dame un Numero");

		int numeroparasiguienteprimo = s.nextInt();
		int resultado = Funciones.funciones.primerprimo(numeroparasiguienteprimo);
		System.out.println(resultado);
		System.out.println();
		System.out.println();

//Digitosn

		System.out.println("numero del digito");
		System.out.println();
		System.out.println("Dime un numero");
		int numdig = s.nextInt();

		System.out.println("Dime la posicion del numero que quieras");
		int pos = s.nextInt();

		int digitosn = Funciones.funciones.digitosn(numdig, pos);
		System.out.println(digitosn);

//Capicuo

		System.out.println("Capicua");

		System.out.println("Dime un numero");
		int numcap = s.nextInt();

		boolean capicua = Funciones.funciones.capicua(numcap);

		System.out.println();
		if (capicua == false) {
			System.out.println("No es un numero capicuo");
		} else {
			System.out.println("El numero es capicuo");

		}

//posicion de digitos
		System.out.println("PosDigitos");
		System.out.println();

		System.out.println("Dime un numero");
		int numdigito = s.nextInt();

		System.out.println("Elige un digito ");
		int digele = s.nextInt();

		int PosDigi = Funciones.funciones.posDigitos(numdigito, digele);

		System.out.println(PosDigi);
	}

}

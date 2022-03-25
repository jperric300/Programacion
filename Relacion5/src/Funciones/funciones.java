package Funciones;

public class funciones {

	// potencia

	public static int potencia(int base, int exponente) {
		int resultado = 1;

		for (int i = 1; i <= exponente; i++) {

			resultado = resultado * base;
		}
		System.out.println("la potencia es " + resultado);

		return resultado;

	}

	// Primo

	public static boolean esprimo(int x) {

		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}

	// Contar digitos

	public static int digitos(int x) {

		int contador = 0;
		if (x == 0) {
			contador = 1;
		} else {
			while (x > 0) {
				x = x / 10;
				contador = contador + 1;
			}
		}

		return contador;
	}

// voltea un numero

	public static int voltea(int x) {

		int invertido = 0;
		int resto;

		while (x > 0) {
			resto = x % 10;
			invertido = invertido * 10 + resto;
			x /= 10;
		}
		return invertido;
	}

// posicion de digitos 4

	public static int posDigitos(int numdigito, int digele) {
int numvolteado;
int contdigi=0;


		if (numdigito > 9) {

			numvolteado = voltea(numdigito);
			int resto=numvolteado%10;
			while (resto!=digele && numvolteado>0) {
				numvolteado=numvolteado/10;
				
				resto=numvolteado%10;
					
				contdigi = contdigi+1 ;
			}
			

		} else {
			return -1;
		}
	
		
		if (digitos(numdigito)==contdigi){
			contdigi=-1;
		}
		return contdigi;
	}

	
	
	//siguiente primo 1
	
	public static int primerprimo(int x) {

		do {
			x++;
		} while (!esprimo(x));
		return x;
	}

	
// escapicua 2
	
	
	public static boolean capicua(int x) {
		int numinverso=0;
		boolean res=false;
				
		if (x > 9) {
			numinverso = voltea(x);
			if(numinverso==x) {
				res=true;
				//System.out.println("El numero es capicua");
			}else {
				res= false;
				//System.out.println("No es un numero capicua");
			}

		} else {
			res=false;
			//System.out.println("No es capicua solo es un número");
		}
		
	return res;
	
	}

	
	
	
	


//digitosn 3
	public static int digitosn(int num, int pos) {

		int resto = -1;
		int voltea = 0;
		pos = pos + 1;
		if (num > 9) {
			voltea = voltea(num);

		} else {
			return num;
		}

		for (int i = 0; i < pos; i++) {
			resto = voltea % 10;
			voltea = voltea / 10;
			if (voltea == 0) {
				resto = -1;
			}
		}
		return resto;

	}
}

//siguiente primo 1

//public static int primerprimo(int x) {
//boolean salir=true;
//boolean primo=false;
//
//return x;
//
//	while(salir==true) {
//		x=x+1;
//		 primo = esprimo(x);
//		if(primo==true) {
//			salir=false;
//			return x;
//		}
//	}
//	

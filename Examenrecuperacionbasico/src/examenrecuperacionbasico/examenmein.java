package examenrecuperacionbasico;

import java.util.Scanner;

public class examenmein {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int fichaj1 = 0;
		int fichaj2 = 0;
		int tamcircuito = 11;
		
		System.out.println("Bienvenido a la carrera del siglo");

		System.out.println("Valor minimo del dado");
		int minDado = s.nextInt();

		System.out.println("Valor maximo del dado");
		int maxDado = s.nextInt();

		System.out.println("Nombre del jugador numero 1");
		String j1 = s.nextLine();

		System.out.println("Nombre del jugador numero 2");
		String j2 = s.nextLine();

		if (j1 == j2) {
			System.out.println("El nombre no puede ser igual");
			System.out.println("Nombre del jugador numero 2");
			j2 = s.nextLine();

			
		while(EsGanador(fichaj1, fichaj2, j1, j2)==false) {
			System.out.println();
			String avanzar = s.nextLine();
			
			System.out.println("Primera tirada del jugador 1");
			tiraDados(minDado, maxDado);
			
			
			System.out.println("Egunda tirada del jugador 1");
			tiraDados(minDado, maxDado);
			
			pintaPista(fichaj1, fichaj2);
			
			
			System.out.println();
			avanzar = s.nextLine();
			
			System.out.println("Primera tirada del jugador 1");
			tiraDados(minDado, maxDado);
			
			System.out.println("Egunda tirada del jugador 1");
			tiraDados(minDado, maxDado);
			
			pintaPista(fichaj1, fichaj2);

		}
				
			}
		}

	



	// Metodo tiraDados

	public static int tiraDados(int minDado, int maxDado) {
		int dadoaleatorio = (int) (Math.random() * (maxDado * minDado + 1)+(minDado));

		System.out.println("El dado ha salido " + dadoaleatorio);
		return dadoaleatorio;
	}

	// Metodo pintaPista

	public static void pintaPista(int fichaj1, int fichaj2) {
		for (int i = 1; i < 12; i++) {
			System.out.print(i + "	");

			if (fichaj1 == i)
				System.out.println("J1");
			if (fichaj2 == i)
				System.out.println("J2");
		}

	}

	// Metodo sumaDenumerosEsprimo

	public static boolean SumaDeNumeroEsprimo( int t1, int t2) {
			    	 int tirada=t1 + t2 ;
					for (int i = 2; i < tirada; i++) {
						if ((tirada % i) == 0) {
							return false;
						}
					}
					return true;
					
				}

	public void ComoVaLaCarrera(int fichaj1, int fichaj2, String j1, String j2) {

		if (fichaj1 == fichaj2) {
			System.out.println("Los dos jugadores van empatados");
		}
		if (fichaj1 > fichaj2) {
			System.out.println(j1 + " va ganando");
		}

		if (fichaj1 < fichaj2) {
			System.out.println(j2 + " va ganando");
		}
	}

	public boolean EsGanador(int fichaj1, int fichaj2, String j1, String j2) {
		if (fichaj1 >= 11) {
			System.out.println(j1 + " ha ganado!!!!");
			return true;
			
		}

		if (fichaj2 >= 11) {
			System.out.println(j2 + " ha ganado!!!!");
			return true;
		}
		
		return false;

		
	}
}

package examenrecuperacionbasico;

public class funcionesexamen {

	
	
	int fichaj1 = 0;
	int fichaj2 = 0;
	int tamcircuito = 11;

	// Metodo tiraDados

	public static int tiraDados(int minDado, int maxDado) {
		int dadoaleatorio = (int) (Math.random(minDado) * maxDado + 1);

		System.out.println("El dado ha salido " + dadoaleatorio);

	}

	// Metodo pintaPista

	public static int pintaPista(int fichaj1, int fichaj2) {
		for (int i = 1; i < 12; i++) {
			System.out.print(i + "	");

			if (fichaj1 == i)
				System.out.println("J1");
			if (fichaj2 == i)
				System.out.println("J2");
		}

	}

	// Metodo sumaDenumerosEsprimo

	public static boolean SumaDeNumeroEsrimo( int t1, int t2) {
			    	t1 + t2 = tirada;
					for (int i = 2; i < tirada; i++) {
						if ((tirada % i) == 0) {
							return false;
						}
					}
					return true;
					
				}

	public void ComoVaLaCarrera (int fichaj1, int fichaj2, String j1 , String j2) {

			    if (fichaj1 == fichaj2){
			    	System.out.println("Los dos jugadores van empatados");
			    }
			    if (fichaj1 > fichaj2) {
			    	System.out.println( j1 + " va ganando");
			    }
			   
			    if (fichaj1 < fichaj2) {
			    	System.out.println( j2 + " va ganando");
			    }

	public void EsGanador() {
		if (fichaj1 >= 11) {
			System.out.println(j1 + " ha ganado!!!!");
		}

		if (fichaj2 >= 11) {
			System.out.println(j2 + " ha ganado!!!!");
		}

	}
	
	}
	
}

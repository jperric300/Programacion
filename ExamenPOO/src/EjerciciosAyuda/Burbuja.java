package EjerciciosAyuda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burbuja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], nElementos, aux;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Di la cantidad de elementos que vamos a usar: "));

		arreglo = new int[nElementos];

		for (int i = 0; i < nElementos; i++) {
			System.out.println((i + 1) + ". Di un numero: ");
			arreglo[i] = entrada.nextInt();
		}

		// Metodo burbuja
		for (int i = 0; i < (nElementos - 1); i++) {
			for (int j = 0; j < nElementos - 1; j++) {
				if (arreglo[j] > arreglo[j + 1]) {// si numero actual > numero siguiente
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}

			}

		}
		
		//Mostrar arreglo ordenado de forma creciente
		System.out.println("\nArreglo ordenado en forma creciente: ");
		for(int i=0;i<nElementos;i++) {
			System.out.println(arreglo[i]+" - ");
		}
		
		System.out.println("");
		
		
		//Mostrar arreglo ordenado de forma decreciente
		System.out.println("\nArreglo ordenado en forma decreciente: ");
		for(int i=(nElementos-1);i>=0;i--) {
			System.out.println(arreglo[i]+" - ");
		}
		
		System.out.println("");
		
	}
}
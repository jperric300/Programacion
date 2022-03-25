package Funciones;

public class FuncionesArrays {

	// generaArrayInt

	public static int[] Array(int dim, int max, int min) {

		int[] array = new int[dim];

		for (int i = 0; i < dim; i++) {
												// cantidad |comienzo
			array[i] = (int) ((Math.random() * (max - min)) + min);
			System.out.print( "  "+array [i]+"  ");
		}
		return array;

	}
	
	
	// MINIMO ARRAY
	
	
	
	
	
	
	
	
	
	

}

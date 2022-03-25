package EjerciciosAyuda;

import java.util.Scanner;

public class Principal_Triangulo_Isoceles {

	//Metodo para sacar el area mayor
		public static double mayorArea(Triangulo_Isoceles triangulos[]) {
			double area;
			
			area=triangulos[0].obtenerArea();
			for(int i=1;i<triangulos.length;i++) {
				if (triangulos[i].obtenerArea()>area) {
					area =triangulos[i].obtenerArea();
				}
			}
			return area;
			
		}

		
		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			
			//Definimos las variables para cada triangulo
			double base,lado;
			int nTriangulos;
			
			System.out.print("Dime la cantidad de triangulos que deseas utilizar :");
			nTriangulos = entrada.nextInt();
			
			//Arrive para poner los triangulos que queramos y se guarden con sus datos
			Triangulo_Isoceles triangulos[] = new Triangulo_Isoceles[nTriangulos] ;
				
			for(int i=0 ; i < triangulos.length ; i++) {
				System.out.println("\nDiga los valores para el triangulo "+(i+1)+":");
				System.out.print("Introduzca la base: ");
				base = entrada.nextDouble();
				System.out.print("Introduzca el lado: ");
				lado = entrada.nextDouble();
				
				triangulos[i] = new Triangulo_Isoceles(base, lado);
				
				System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
				System.out.println("\nEl area del triangulo es: "+triangulos[i].obtenerArea());

			}
			 
			//Pintar cual es el area mayor
			System.out.println("\nEL area del triangulo de mayor superficie es "+mayorArea(triangulos));
			
		}

	}


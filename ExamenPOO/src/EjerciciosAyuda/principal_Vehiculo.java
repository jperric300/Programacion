package EjerciciosAyuda;

import java.util.Scanner;

public class principal_Vehiculo {

	//Metodo para mostrar todas las caracteristicas del coche mas barato
		public static int CocheMBarato(Vehiculo coches[]) {
			double precio;
			int indice = 0;
			
			precio=coches[0].getPrecio();
			for(int i=1;i<coches.length;i++) {
				if(coches[i].getPrecio()<precio) {
				precio=coches[i].getPrecio();
				indice=i;
				}
			}
			return indice;
		}
		

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			String marca;
			String modelo;
			double precio;
			int nVehiculos,CocheBarato;
			
			System.out.print("Dime cuantos vehiculos vamos a utilizar: ");
			 nVehiculos = entrada.nextInt();
			 
			 
			 //Arrive para crear un objeto para cada coche
			 Vehiculo coches[] = new Vehiculo[nVehiculos];
			 
			 for (int i=0 ; i<coches.length;i++) {
				 System.out.println("\nDime las caractericsticas del coche "+(i+1)+"\n");
			 
				 System.out.print("Introduce la Marca: ");
				 marca= entrada.nextLine();
				 System.out.print("Introduce el Modelo: ");
				 modelo= entrada.nextLine();
				 System.out.print("Introduce el precio: ");
				 precio= entrada.nextDouble();
			 
				 coches[i]= new Vehiculo(marca,modelo,precio);
				 
				 
			 }
			
			 //Mostrar coche mas barato
			CocheBarato=CocheMBarato(coches);
			System.out.println("\nEl coche mas barato es: ");
			System.out.println(coches[CocheBarato].mostrarDatos());
			
			
			
		}

	}
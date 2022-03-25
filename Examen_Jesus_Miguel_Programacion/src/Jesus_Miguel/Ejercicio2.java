package Jesus_Miguel;

import java.util.Scanner;




public class Ejercicio2 {
	

	static Scanner entrada = new Scanner(System.in);

	
	public static void imprimeOpciones() {
		
	      System.out.println("1. Nuevo vehiculo");
	      System.out.println("2. Ver matrícula");
	      System.out.println("3. Ver numero de kilometros");
	      System.out.println("4. Actualizar Kilometros");
	      System.out.println("5. Ver años de antiguedad");
	      System.out.println("6. Mostrar propietario");
	      System.out.println("7. Mostrar descripcion");
	      System.out.println("8. Mostrar precio");
	      System.out.println("9. Salir");
	      System.out.print("Introduzca una opción: ");

	     
	     
	  }

	
	
	public static void main(String[] args) {
		int opcion;
		int aux=1;
		String marca;
		
		boolean cochecreado=false;
	do{
		imprimeOpciones();
		opcion = entrada.nextInt();
		Vehiculos coche1 = new Vehiculos();

		switch (opcion) {
		case 1:
			cochecreado=true;
			System.out.println("\n");
			
			System.out.println("Digame la marca del vehiculo");
			entrada.nextLine();
			marca=entrada.nextLine();
			coche1.setMarca(marca);
			
			System.out.println("Digame la matricula del vehiculo");
			coche1.setMatricula(entrada.nextLine());
			
			System.out.println("Digame el numero de kilometros del vehiculo");
			coche1.setnKilometros(entrada.nextInt());
			
			entrada.nextLine();
			
			
			System.out.println("Digame la fecha de matriculacion del vehiculo");
			coche1.setFmatriculación(entrada.nextLine());
			
			System.out.println("Digame la descripcion del vehiculo");
			coche1.setDescripcion(entrada.nextLine());
			
			
			System.out.println("Digame el precio del vehiculo");
			coche1.setPrecio(entrada.nextDouble());
			
			entrada.nextLine();
			System.out.println("Digame el nombre del propietario");
			coche1.setNombre(entrada.nextLine());
			
			
			System.out.println("Digame el dni del propietario");
			coche1.setDNI(entrada.nextLine());
			 
			System.out.println("");
			System.out.println("");
				 break;
				 
				 
		case 2:
			if(cochecreado=true) {
			System.out.println("la matricula es "+ coche1.getMatricula());
			}else {
				System.out.println("Añade un vehiculo");
			}
			break;

		case 3:
			if(cochecreado=true) {
			System.out.println("el coche tiene "+ coche1.getnKilometros()+" Kilometros");
			}else {
				System.out.println("Añade un vehiculo");
			}
			break;
			
		case 4:
			if(cochecreado=true) {
			System.out.println("cuantos kilometros le quieres añadir");
			int mKilometros = entrada.nextInt();
			}else {
				System.out.println("Añade un vehiculo");
			}
			
			break;
			
		case 5:
			if(cochecreado=true) {
				System.out.println("El vehiculo tirne: " +coche1.getAnio()+" años");
				
					System.out.println("Añade un vehiculo");
				}
			
			break;
			
		case 6:
			if(cochecreado=true) {
				System.out.println("EL propietario es: " +coche1.getNombre());
				System.out.println("el dni del propietario es: "+coche1.getDNI());
				
				}else {
					System.out.println("Añade un vehiculo");
				}
			
			break;
			
		case 7:
			if(cochecreado=true) {
				System.out.println("La descripción del vehiculo es: " +coche1.getDescripcion());
				System.out.println("la matricula del vehiculo es: "+coche1.getMatricula());
				System.out.println("Tiene "+coche1.getnKilometros()+" Kilometros");
				}else {
					System.out.println("Añade un vehiculo");
				}
			
			break;
			
		case 8:
			
			if(cochecreado=true) {
				System.out.println("el coche tiene un precio de " +coche1.getPrecio());
				}else {
					System.out.println("Añade un vehiculo");
				}
			
			
			break;
		case 9:
			
			break;
			
		default:
			System.out.println("\nHa salido de la aplicación");

		
	}	}while(opcion!=9);
	entrada.close();
	

}




	}

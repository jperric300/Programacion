package ejercicios;

import java.util.Scanner;

public class libromain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		//creacion de objeto
				
		
		//1 Crea el objeto libro1 utilizando el constructor con parámetros  Libro("El quijote", "Cervantes", 1, 0)
				Libro libro1  = new Libro("El quijote", "Cervantes", 1, 0);
		
		
		//2 Crea el objeto libro2 utilizando el constructor por defecto
				Libro libro2  = new Libro();
						
				
		//3 Asigna a libro2 los datos pedidos por teclado.
				
				System.out.println("Nombre del libro");
				libro2.setLibro(s.nextLine());
				
				System.out.println("Escribe el autor del libro");
				libro2.setAutor(s.nextLine());
				
				System.out.println("Escribe el n de ejemplar");
				libro2.setNEjemplares(s.nextInt());
				
				System.out.println("Escribe el n de ejemplares prestados");
				libro2.setEjemplaresPres(s.nextInt());
			
		
		//4 Muestran por pantalla los datos del objeto libro1.
				
				System.out.println("El libro 1 se llama "+ libro1.getLibro());
				System.out.println("El autor del libro 1 se llama "+ libro1.getAutor());
				System.out.println("El libro 1 tiene "+ libro1.getNEjemplares()+" ejemplares");
				System.out.println("El libro 1 tiene "+ libro1.getEjemplaresPres()+" ejeplares prestados");


			
				
		
		
		//5 Realiza un préstamo de libro1. El método devuelve true si se ha 
				//podido realizar el préstamo y false en caso contrario. 
				
				libro1.prestamo();
		
		//6 Realiza una devolución de libro1.
				//El método devuelve true si se ha podido realizar la devolución y false en caso contrario. 
				libro1.devolucion();
		
		//7 Realiza un préstamo de libro1.
		
				libro1.prestamo();
		
		//8 Realiza otro préstamo de libro1. En este caso no se podrá realizar ya que solo hay un ejemplar de este libro y ya está prestado
				//Se mostrará por pantalla el mensaje “No quedan ejemplares del libro…”
			
				libro1.prestamo();
				
				
		//9 Mostrar los datos del objeto libro1
				
			System.out.println(libro1);
		
		//10 Mostrar los datos del objeto libro2
			System.out.println(libro2);

	}

}

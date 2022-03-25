/**Realiza el control de acceso a una caja fuerte. La combinación 
* será un número de 4 cifras. El programa nos pedirá la combinación
*para abrirla. Si no acertamos, se nos mostrará el mensaje 
*“Lo siento, esa no es la combinación” y si acertamos se nos dirá 
*“La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro 
*oportunidades para abrir la caja fuerte*/
	
package relaciones2;

public class relaciones2_7 {

	public static void main(String[] args) {
	int contra=1234;

	
	System.out.print("Dime una combinación de 4 cifras");
	
	if (contra==1234) {
	System.out.print("La caja fuerte se ha abierto satisfactoriamente");
	
	}else {
	System.out.print("Lo siento, esa no es la combinación");
	}
	}
}



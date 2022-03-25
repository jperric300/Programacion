package relaciones2;

import java.util.Scanner;

public class trabajobingo2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

        // Menu principal de juego //

        System.out.println("******BINGO IES MARTÍNEZ MONTAÑÉS*****");
        System.out.println("");
        System.out.println("            PREMIOS");
        System.out.println("         Linea:  100 $");
        System.out.println("         BINGO:  500 $");
        System.out.println("");
        System.out.println("Pulse cualquier tecla para continuar");

        String cualquier = sn.next();

        System.out.println("");
        System.out.println("");

        // Jugador 1

        System.out.println(" ----------------------------------");
        System.out.println("            Jugador 1");
        System.out.println(" ----------------------------------");

        int acumulado1 = 0;

        // Carton 1

        int[][] carton1 = new int[3][5];

        int incr1 = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int valorEntero = (int) (Math.random() * 9 + incr1);
                carton1[i][j] = valorEntero;
                System.out.print("  " + carton1[i][j] + "  |");
                incr1 = incr1 + 10;
            }
            incr1 = 1;
            System.out.println();
        }

        System.out.println();
        System.out.println("Dinero Acumulado = " + acumulado1 + "$");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        // Jugador 2//

        System.out.println(" ----------------------------------");
        System.out.println("            Jugador 2");
        System.out.println(" ----------------------------------");

        int acumulado2 = 0;

        // carton 2

        int[][] carton2 = new int[3][5];

        int incr2 = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int valorEntero = (int) (Math.random() * 9 + incr2);
                carton2[i][j] = valorEntero;
                System.out.print("  " + carton2[i][j] + "  |");
                incr2 = incr2 + 10;
            }
            incr2 = 1;
            System.out.println();
        }

        System.out.println("");
        System.out.println("Dinero Acumulado = " + acumulado2 + "$");

        System.out.println("");
        System.out.println("");

        boolean bingo = false;
        boolean linea1 = false;
        boolean linea2 = false;
        int acumlinea1a = 0;
        int acumlinea1b = 0;
        int acumlinea1c = 0;
        int acumlinea2a = 0;
        int acumlinea2b = 0;
        int acumlinea2c = 0;
        int acumbingo1 = 0;
        int acumbingo2 = 0;

        // coomienzo del bucle
        do {

            // sacar bola

            System.out.println("Pulsa cualquier tecla para sacar una bola");
            String cualquierr = sn.next();

            System.out.println("");

            int bola = (int) (Math.floor(Math.random() * 49 + 1));

            System.out.println("la bola que ha salido es el número " + bola);
            System.out.println("");

            // Carton 1 y 2
            // Asignarle el numero 100 a bola para lineas o bingo etc.

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bola == carton1[i][j]) {
                        carton1[i][j] = 100;
                        acumbingo1 = acumbingo1 + 1;

                    }
                    if (bola == carton2[i][j]) {
                        carton2[i][j] = 100;
                        acumbingo2 = acumbingo2 + 1;

                    }
                    
                    
                    
                }
            }

            // Pintar la XX carton 1
            // Jugador 1

            System.out.println(" ----------------------------------");
            System.out.println("            Jugador 1");
            System.out.println(" ----------------------------------");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (carton1[i][j] == 100) {
                        if (j==0) {
                            System.out.print("  " + "X" + "  |");
                        } else {

                            System.out.print("  " + "XX" + "  |");
                        }
                    }

                    else {
                        System.out.print("  " + carton1[i][j] + "  |");

                    }
                }
                System.out.println();
            }
            System.out.println();

            System.out.println();
            System.out.println();

            
         // pintar la XX carton 2

            // Jugador 2

            System.out.println(" ----------------------------------");
            System.out.println("            Jugador 2");
            System.out.println(" ----------------------------------");
            boolean cantar = false;
            int p =0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    
                     
                     
						
					
                     
                    if (carton2[i][j] == 100) {
                        if (j==0) {
                            System.out.print("  " + "X" + "  |");
                        } else {

                            System.out.print("  " + "XX" + "  |");
                        }
                    }

                    else {
                        System.out.print("  " + carton2[i][j] + "  |");

                    } p +=carton2[i][j];
                    if (p==500 && !linea2) {
                   	 cantar = true;
                    }
                   	if (cantar = true) 
                   	{
                   	 System.out.println("Jugador 1 linea");}
                   	 
                    
                }
                System.out.println();
            }
            System.out.println();

            System.out.println();
            System.out.println();
            
            
            
            
            //O P C I O N 3
            
          
            
            // O P C I O N  1
            /*
             * Linea Jugador 1
             * 
             * for (int i = 0; i < 3; i++) { acumlinea1 = acumlinea1 + i; }
             * 
             * if (acumlinea1 == 500) { linea1 = true;}
             * 
             * if(linea1==true) {
             * System.out.println("!!LINEA!! El jugador 1 Ha cantado linea"); acumulado1 =
             * acumulado1 + 100; System.out.println("");
             * System.out.println("  DINERO ACUMULADO");
             * System.out.println("-------------------------");
             * System.out.println(" Jugador 1 " + acumulado1 + "$");
             * System.out.println(" Jugador 2 " + acumulado2 + "$");
             * 
             * }
             */

            /*
             * linea Jugador 2
             * 
             * for (int i = 0; i < 3; i++) { acumlinea2 = acumlinea2 + i; }
             * 
             * if (acumlinea2 == 500) {
             * System.out.println("!!LINEA!! El jugador 2 Ha cantado linea"); acumulado2 =
             * acumulado2 + 100; System.out.println("");
             * System.out.println("  DINERO ACUMULADO");
             * System.out.println("-------------------------");
             * System.out.println(" Jugador 1 " + acumulado1 + "$");
             * System.out.println(" Jugador 2 " + acumulado2 + "$");
             * 
             * }
             */

         /*   
            // O P C I O N  2
//linea Jugador 1

            // linea 1

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (carton1[i][j] == 100) {
                    	if (i==0) {
                    		acumlinea1a = acumlinea1a + 1;
						}if (i==1) {
                    		acumlinea1b = acumlinea1b + 1;
						}if (i==2) {
                    		acumlinea1c = acumlinea1c + 1;
						}
                    }
                }
            }
                        if (acumlinea1a == 5) {
                            System.out.println("!!Lineaaa!! el jugador 1 ha tenido linea en la fila 1");
                            System.out.println("  DINERO ACUMULADO");
                            System.out.println("-------------------------");
                            System.out.println(" Jugador 1 " + acumulado1 + "$");
                            System.out.println(" Jugador 2 " + acumulado2 + "$");
                        }
                  
                

            

            // linea 2

       
                        if (acumlinea1b == 5) {
                            System.out.println("!!Lineaaa!! el jugador 1 ha tenido linea en la fila 2");
                            System.out.println("  DINERO ACUMULADO");
                            System.out.println("-------------------------");
                            System.out.println(" Jugador 1 " + acumulado1 + "$");
                            System.out.println(" Jugador 2 " + acumulado2 + "$");
                        }
                   

            // linea 3

           
                        if (acumlinea1c == 5) {
                            System.out.println("!!Lineaaa!! el jugador 1 ha tenido linea en la fila 3");
                            System.out.println("  DINERO ACUMULADO");
                            System.out.println("-------------------------");
                            System.out.println(" Jugador 1 " + acumulado1 + "$");
                            System.out.println(" Jugador 2 " + acumulado2 + "$");
                        }
                    
            // linea Jugador 2

            // linea 1
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bola == carton2[i][j]) {
                        acumlinea2a = acumlinea2a + 1;
                    }if (acumlinea2a == 5) {
                        System.out.println("!!Lineaaa!! el jugador 2 ha tenido linea en la fila 1");
                        System.out.println("  DINERO ACUMULADO");
                        System.out.println("-------------------------");
                        System.out.println(" Jugador 1 " + acumulado1 + "$");
                        System.out.println(" Jugador 2 " + acumulado2 + "$");
                    }
                }
                }
                

            // linea 2

            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bola == carton2[i][j]) {
                        acumlinea2b = acumlinea2b + 1;
                    }if (acumlinea2b == 5) {
                        System.out.println("!!Lineaaa!! el jugador 2 ha tenido linea en la fila 2");
                        System.out.println("  DINERO ACUMULADO");
                        System.out.println("-------------------------");
                        System.out.println(" Jugador 1 " + acumulado1 + "$");
                        System.out.println(" Jugador 2 " + acumulado2 + "$");
                    }
                }
                }
                

            // linea 3

            for (int i = 2; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bola == carton2[i][j]) {
                        acumlinea2c = acumlinea2c + 1;
                    }if (acumlinea2c == 5) {
                        System.out.println("!!Lineaaa!! el jugador 1 ha tenido linea en la fila 3");
                        System.out.println("  DINERO ACUMULADO");
                        System.out.println("-------------------------");
                        System.out.println(" Jugador 1 " + acumulado1 + "$");
                        System.out.println(" Jugador 2 " + acumulado2 + "$");
                    }
                }
                }
                
            
            */
        
            
            
            

            // bingo jugador 1

            if (acumbingo1 == 15) {
                bingo = true;

                acumulado1 = acumulado1 + 500;
            }

            // bingo jugador 2

            if (acumbingo2 == 15) {
                bingo = true;
                acumulado2 = acumulado2 + 500;
            }

        } while (!bingo);
        System.out.println();

        // si gana jugador 1
        if (acumbingo1 == 15 & acumbingo2 != 15) {
            System.out.println("¡¡¡BINGO!!!  EL JUGADOR 1 HA GANADO");
            System.out.println("");
            System.out.println("Premio total del ganador: " + acumulado1 + "$");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("EL JUGADOR 2 HA PERDIDO");
            System.out.println("");
            System.out.println("Premio total del jugador 2: " + acumulado2 + "$");
        }

        // si gana jugador 2
        if (acumbingo2 == 15 & acumbingo1 != 15) {
            System.out.println("¡¡¡BINGO!!!  EL JUGADOR 2 HA GANADO");
            System.out.println("");
            System.out.println("Premio total del ganador: " + acumulado2 + "$");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("EL JUGADOR 1 HA PERDIDO");
            System.out.println("");
            System.out.println("Premio total del jugador 1: " + acumulado1 + "$");
            System.out.println("");
            System.out.println("");

            if (acumbingo2 == 15 & acumbingo1 == 15) {
                System.out.println("¡¡¡BINGO!!!  Los dos Jugadores han cantado Bingo");
                System.out.println("");
                System.out.println("  DINERO ACUMULADO");
                System.out.println("-------------------------");
                System.out.println(" Jugador 1 " + acumulado1 + "$");
                System.out.println(" Jugador 2 " + acumulado2 + "$");

                if (acumulado1 > acumulado2) {
                    System.out.println("");
                    System.out.println("!Ha ganado el jugador 1 porque tiene más dinero acumulado!");
                } else {
                    System.out.println("!Ha ganado el jugador 2 porque tiene más dinero acumulado!");
                }
            }
        }

    }





	}



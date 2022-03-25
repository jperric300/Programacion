Algoritmo Busqueda_del_tesoro
	
	//Se colocan una mina y un tesoro de forma aleatoria en un cuadrantede cuatro filas por cinco columnas. El 
	//usuario intentará averiguar dónde está el tesoro de la siguiente forma.
	//En cada tirada se pide la coordenada x y la coordenada y. 
	//Si en esa ubicación no se encuentra ni la mina ni el tesoro, se marcará en el cuadrante una X. 
	//Si en esa ubicación se encuentra la mina, el programa mostrará  un mensaje indicando al jugador que ha
	//perdido y dibujará en el cuadrante el tesoro (con un simbolo de ?) y la mina ( con un símbolo de *).
	//Si en esa ubicación se encuentra el tesoro, el programa mostrará  un mensaje indicando al jugador que 
	//ha ganado y dibujará en el cuadrante el tesoro (con un simbolo de ?) y la mina ( con un símbolo de *).
	//El juego finaliza cuando el jugador ha encontrado la mina o el tesoro.
	
	
	
	Dimension juego[4,5]
	
	//asigno tabla
	
	para i=1 Hasta 4
		para j=1 hasta 5
			juego[i,j]="X"
		FinPara
		Escribir ""
	FinPara
	
	//valor tesoro
	xtesoro=azar(4)+1
	ytesoro=azar(5)+1
	juego[xtesoro,ytesoro]="$"
	
	
	//valor mina
	xmina=azar(4)+1
	ymina=azar(5)+1
	juego[xmina,ymina]="*"
	
	//bucle para que no sea el mismo 
	Mientras juego[xtesoro,ytesoro]=juego[xmina,ymina] Hacer
		xmina=azar(4)+1
		ymina=azar(5)+1
		
	Fin Mientras
	
	
	//pintar el juego 
	para i=4 Hasta 1
		escribir Sin Saltar i "| "
		para j=1 hasta 5
			Escribir Sin Saltar juego[i,j], "   "
			
		FinPara
		Escribir ""
	FinPara
	
	
	//para escribir la linea de abajo
	Para i=1 Hasta 5
		escribir Sin Saltar "   -"
	FinPara
	escribir ""
	
	para i=1 Hasta 5 Hacer
		Escribir sin saltar "   " i 
	FinPara
	escribir ""
	
FinAlgoritmo

	
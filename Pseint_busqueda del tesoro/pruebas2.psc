Algoritmo sin_titulo
	Dimension juego[4,5]
	
	//asigno tabla
	
	para i=1 Hasta 4
		para j=1 hasta 5
			juego[i,j]=" "
		FinPara
		Escribir ""
	FinPara
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
	
	//escribir los numeros de abajo
	para i=1 Hasta 5 Hacer
		Escribir sin saltar "   " i 
	FinPara
	escribir ""
	
	//valor tesoro
	xtesoro=azar(4)+1
	ytesoro=azar(5)+1
	// juego[xtesoro,ytesoro]="$"
	
	//valor mina
	xmina=azar(4)+1
	ymina=azar(5)+1
	// juego[xmina,ymina]="*"
	
	//bucle para que no sea el mismo 
	Mientras xtesoro= xmina y ytesoro=ymina Hacer
		xmina=azar(4)+1
		ymina=azar(5)+1
		
	Fin Mientras
	
	encontrado= falso
	
	//tesoro
	
	Repetir
		
	    Escribir ""
		
		escribir "Dime una cordenada X"
		leer usuy
		Escribir ""
		
		escribir "Dime una cordenada Y"
		leer usux
		Escribir ""
		
		
		si usuy<1 o usuy>5 Entonces
			Escribir "la coordenada x elegida no es válida"
			leer usuy
			
		FinSi
		
		si usux<1 o usux>4 Entonces
			Escribir "la coordenada y elegida no es válida"
			leer usux
			
		FinSi
		
		
		si usux=xtesoro y usuy=ytesoro Entonces
			escribir "Has encontrado el tesoro, Has ganado."
			juego[xtesoro,ytesoro]="$"
			juego[xmina,ymina]="*"
			
			encontrado= verdadero
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
			
			//escribir los numeros de abajo
			para i=1 Hasta 5 Hacer
				Escribir sin saltar "   " i 
			FinPara
			escribir ""
			
		FinSi
		
		//mina
		
		Si usux=xmina y usuy=ymina Entonces
			escribir "Has perdido."
			juego[xtesoro,ytesoro]="$"
			juego[xmina,ymina]="*"
			encontrado= verdadero
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
			
			
			//escribir los numeros de abajo
			
			para i=1 Hasta 5 Hacer
				Escribir sin saltar "   " i 
			FinPara
			
			escribir ""
			
		FinSi
		
		//cuando no se acierto
		
		si no encontrado Entonces
			
			juego[usux,usuy]="X"
			
			
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
			Escribir " "
			Escribir "Has fallado, prueba de nuevo."
			
			
		FinSi

Hasta Que encontrado


FinAlgoritmo

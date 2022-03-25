Algoritmo pruebas
	
	Dimension juego[4,5]
	
	//asigno tabla
	
	para i=1 Hasta 4
		para j=1 hasta 5
			juego[i,j]="a"
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
	juego[xtesoro,ytesoro]="$"
	
	Escribir xtesoro,ytesoro
	
	//valor mina
	xmina=azar(4)+1
	ymina=azar(5)+1
	juego[xmina,ymina]="*"
	
	//bucle para que no sea el mismo 
	Mientras xtesoro= xmina y ytesoro=ymina Hacer
		xmina=azar(4)+1
		ymina=azar(5)+1
		
	Fin Mientras
	
	encontrado= falso
	
	//pintar el juego 
	Repetir
		
	
	escribir "Dime una cordenada X"
	leer usux
	
	escribir "Dime una cordenada Y"
	leer usuy
	
	si usux=xtesoro y usuy=ytesoro Entonces
		escribir "Has encontrado el tesoro"
		encontrado= Verdadero
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
	
Hasta Que  encontrado
//usux=tesorox y usuy=tesoroy o usux=xmina y usuy=ymina


	Si usux=xmina y usuy=ymina entonces
		escribir "Has perdido"
	FinSi
	
	
	
	
FinAlgoritmo

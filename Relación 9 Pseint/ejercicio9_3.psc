Algoritmo ejercicio9_3
	
	
	
	dimension datos[5]
	Escribir "Dime 5 datos"
	
	
	leer Datos[1]
	leer datos[2]
	leer datos[3]
	leer datos[4]
	leer datos[5]
	
	
	suma=0
	
	Mientras n<0 o n>10 Hacer
		Escribir "Los datos introducidos no son correctos"
		leer datos[1]
	FinMientras
	para n=1 Hasta 5 con paso 1 hacer 
		suma=suma+datos[n]
		
	FinPara
	
	media=suma/5
	
	Escribir"La media de los examenes es  " suma/5
	escribir" "
	
	
	Para n=1 Hasta 5 Con Paso 1 Hacer
		si datos[n] > media Entonces
			escribir " estas son las notas por encima de la media  "
			escribir Datos[n]
		
		FinSi
	Fin Para
	
	
	
	
	
	
FinAlgoritmo

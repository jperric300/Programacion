Algoritmo ejercicio9_6
	
	dimension datos[7]
	
	
	
	Escribir "Dime 7 numeros enteros"
	Para n=1 Hasta 7 
		leer datos[n]
		
	Fin Para
	
	mayor = datos[1]
	
	para n=1 hasta 7
		si mayor < datos[n] Entonces
			mayor=datos[n]
		FinSi
	FinPara
	
	Escribir "el número mayor es " mayor
	
FinAlgoritmo

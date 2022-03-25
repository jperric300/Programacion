Algoritmo ejercicio9_10
	
	//Si has estudiado álgebra matricial,
	//prepara un programa que calcule el determinante de una matriz de 3x3.
	
	Dimension datos[3,3]
	
	Escribir "Dime una matriz"
	para n=1 Hasta 3 Hacer
		leer datos[n,1]
	FinPara
	
	
	Escribir "Dime una matriz"
	para n=1 Hasta 3 Hacer
		leer datos[n,2]
	FinPara
	
	
	Escribir "Dime una matriz"
	para n=1 Hasta 3 Hacer
		leer datos[n,3]
	FinPara
	
	determinante= datos[1,1]*datos[1,2]*datos[1,3]-datos[2,1]*datos[2,2]*datos[2,3]-datos[3,1]*datos[3,2]*datos[3,3]-datos[1,1]*datos[1,2]*datos[1,3]+datos[2,1]*datos[2,2]*datos[2,3]+datos[3,1]*datos[3,2]*datos[3,3]
escribir determinante	
FinAlgoritmo

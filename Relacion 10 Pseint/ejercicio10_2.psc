Algoritmo ejercicio10_2
	
//Haz un programa que calcule ra�ces cuadradas:
//el usuario introducir� un n�mero y se le mostrar� su ra�z cuadrada.
//Se repetir� hasta que introduzca el n�mero 0 (para el que no se deber� mostrar su ra�z).
//Si introduce un valor negativo, se deber� mostrar un aviso en vez de intentar calcular su ra�z.
	
	
	
	Escribir"dime un n�mero para realizar la ra�z cuadrada"
	leer n
	
	escribir "Su raiz es " raiz(n)
	Repetir
		escribir "Su raiz es " raiz(n)
		leer n
		si n<0 Entonces
			Escribir "Cuidado el n�mero que has elegido es negativo"
			leer n
		FinSi
	Hasta Que n=0
	
	
	
FinAlgoritmo

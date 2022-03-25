Algoritmo ejercicio10_2
	
//Haz un programa que calcule raíces cuadradas:
//el usuario introducirá un número y se le mostrará su raíz cuadrada.
//Se repetirá hasta que introduzca el número 0 (para el que no se deberá mostrar su raíz).
//Si introduce un valor negativo, se deberá mostrar un aviso en vez de intentar calcular su raíz.
	
	
	
	Escribir"dime un número para realizar la raíz cuadrada"
	leer n
	
	escribir "Su raiz es " raiz(n)
	Repetir
		escribir "Su raiz es " raiz(n)
		leer n
		si n<0 Entonces
			Escribir "Cuidado el número que has elegido es negativo"
			leer n
		FinSi
	Hasta Que n=0
	
	
	
FinAlgoritmo

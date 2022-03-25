Algoritmo ejercicio10_1
	
	numero<-Azar(100)
	Escribir numero
	
	Escribir "Dime un número a ver si aciertas"
	leer n
	contador=1
	Para contador=2 Hasta 7 Con Paso 1 Hacer
		
		si n=numero Entonces
			Escribir "Enhorabuena el numero elegido es correcto" 
			contador=10
		SiNo
			si n<numero Entonces
				escribir "el numero x es mayor que el que has elegido"
			FinSi
				si n>numero Entonces
					escribir "el numero x es menor que el que has elegido"
				FinSi
			
			
			leer n
		FinSi
	Fin Para
	
	si n<>numero Entonces
		Escribir "lo siento has perdido las oportunidades"
	FinSi
	
FinAlgoritmo

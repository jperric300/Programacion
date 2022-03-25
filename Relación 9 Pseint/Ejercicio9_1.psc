Algoritmo Ejercicio9_1
	
	Dimension datos[12]
	
	datos[1]=31
	datos[2]=28
	datos[3]=31
	datos[4]=30
	datos[5]=31
	datos[6]=30
	datos[7]=31
	datos[8]=31
	datos[9]=30
	datos[10]=31
	datos[11]=30
	datos[12]=31
	
	Escribir "dime un numero del mes"
	leer n
	
	mientras n>12 o n<1 Hacer
		Escribir "El numero del mes no es válido"
		leer n
	FinMientras
	
	
	Escribir "el mes elegido tiene " datos[n] " dias"
FinAlgoritmo

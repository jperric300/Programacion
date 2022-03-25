Algoritmo Adicional_1
	//Hacer un programa que introduzca por teclado un número total
	//de segundos y que luego pueda 
	//mostrar la cantidad de horas, minutos y segundos
	//que existen en el valor introducido.
	
	
	escribir"dime un numero total de segundos"
	leer n
	
	mientras n<0 Hacer
		Escribir "el valor introducido no es válido"
		leer n
		FinMientras
		
	min=n/60	
		
	hora=n/3600
	
	Escribir "su numero es igual a " trunc(min) "minutos"
	Escribir "su número de segundos es igual a " trunc(hora) "Hora"
	
	
	
FinAlgoritmo


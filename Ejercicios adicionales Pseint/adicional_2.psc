Algoritmo adicional_2
	
	
	//Introducir la fecha actual y mostrar el número total
	//de días transcurridos desde el inicio de este 
	//año, considerando que todos los meses tienen 30 días
	
	
	Escribir "introduce a que dia estamos hoy"
	leer dia
	escribir "introduce a que mes estas hoy"
	leer mes
	
	mientras dia<1 o dia>30 hacer
		Escribir "el dia elegido no es válido"
		leer dia
	FinMientras
	
	mientras mes<0 o mes>12 hacer
		Escribir "el mes elegido no es válido"
		leer mes
	FinMientras
	
	fecha=dia + (mes-1) * 30
	Escribir  "han pasado " fecha " dias"
	
	
	
FinAlgoritmo

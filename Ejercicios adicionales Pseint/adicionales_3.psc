Algoritmo adicionales_3
	
	escribir"dame un numero de 3 cifras"
	
	leer n
	
	centena=trunc(n/100)
	decena=trunc((n-centena*100)/10)
	unidades= trunc(n-(centena*100+decena*10))
	

	
	Si centena=unidades Entonces
		escribir "el numero " n " es capic�a"
	SiNo
		escribir "el numero " n " no es capic�a"
	Fin Si
	
FinAlgoritmo

Algoritmo ejercicio9_7
	
	Dimension datos[10]
	
	
	
	
	datos[1] <- 10
    datos[2] <- 25
    datos[3] <- 50
    datos[4] <- 11
    datos[5] <- 26
    datos[6] <- 51
	datos[7] <- 82
    datos[8] <- 1
    datos[9] <- 69
    datos[10] <- 69
  
	Escribir "Que datos deseas buscar"
	leer n
	contador=0
	
	Para i=1 Hasta 10 
		si n=datos[i] Entonces 
			contador=contador+1
			Escribir "valor encontrado en la posición " i
		FinSi
	Fin Para
escribir "el numero ha aparecido " contador " veces"
	
FinAlgoritmo

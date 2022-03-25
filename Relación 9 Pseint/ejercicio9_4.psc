
Algoritmo ejercicio9_4
	
	Dimension datos1[3],datos2[3] ,suma[3]
	
	Escribir "Dame 1 vector(3 números)"
	

	Para n <- 1 Hasta 3 Hacer
        Leer datos1[n]
    FinPara

	
	Escribir "Dame otro vector(3 números)"
	
	
	Para n <- 1 Hasta 3 Hacer
        Leer datos2[n]
    FinPara

	Escribir "la suma de los vectores es "
	Para n <- 1 Hasta 3 Hacer
		suma[n]=datos1[n]+datos2[n]
		Escribir suma[n]
    FinPara
	
FinAlgoritmo

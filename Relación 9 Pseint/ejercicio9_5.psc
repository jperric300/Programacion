Algoritmo ejercicio9_5
	
	Dimension datos1[3],datos2[3],producto[3]
	
	Escribir "Dame 1 vector(3 números)"
	
	
	Para n <- 1 Hasta 3 Hacer
        Leer datos1[n]
    FinPara
	
	
	Escribir "Dame otro vector(3 números)"
	
	
	Para n <- 1 Hasta 3 Hacer
        Leer datos2[n]
    FinPara
	
	Escribir "el resultado de las operaciones es  "
	
	Para n <- 1 Hasta 3 Hacer
        producto[n]=datos1[n]*datos2[n]
		resultado=producto[1]+producto[2]+producto[3]
    FinPara
	
	escribir resultado
	
	
FinAlgoritmo

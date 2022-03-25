Algoritmo ejercicio11_4
	
	Escribir "Dime un nombre"
	Leer nombre
	nombre=Minusculas(nombre)

	Para j<-1 Hasta longitud(nombre) Hacer
		
		p<-subcadena(nombre,j,j)
		
		si p="a" o p="o" o p="e" o p="i" o p="u"
			
			escribir Sin Saltar p
			
		FinSi
		
		
	FinPara

	Escribir " "
FinAlgoritmo
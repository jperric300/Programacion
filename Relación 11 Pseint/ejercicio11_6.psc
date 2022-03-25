Algoritmo ejercicio11_6
	
	Escribir "escribe tu nombre y apellidos"
	leer nombre
	nombre=Minusculas(nombre)
	
	Para j<-1 Hasta longitud(nombre) Hacer
		
		p<-subcadena(nombre,j,j)
		
		si p=subcadena(nombre,1,1)
			Escribir Sin Saltar Mayusculas(p)
			
		FinSi
		
		si p=" " Entonces
			escribir sin saltar Mayusculas(subcadena(nombre,j+1,j+1))
		sino
		escribir Sin Saltar subcadena(nombre,j+1,j+1)
		FinSi
		
	FinPara
	Escribir ""
	
FinAlgoritmo

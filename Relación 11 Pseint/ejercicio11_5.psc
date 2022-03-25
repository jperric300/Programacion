Algoritmo ejercicio11_5
	
	Escribir "Escribe una frase"
	leer frase
	cont=1
	
	Para j<-1 Hasta longitud(frase) Hacer
		
		p<-subcadena(frase,j,j)
		k<-subcadena(frase,j+1,j+1)
		si p=" " y k<>" " Entonces
			cont=cont+1
		FinSi
	FinPara
	
	escribir "Contiene " cont " palabras"
FinAlgoritmo
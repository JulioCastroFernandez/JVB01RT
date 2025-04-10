Algoritmo MayorDeTresNumeros
	Definir num1, num2, num3 Como Entero
	Escribir "Introduzca tres números enteros distintos."
	Escribir 'Introduzca el primer número.'
	Leer num1
	Escribir 'Introduzca el segundo número.'
	Leer num2
	Escribir 'Introduzca el tercer número.'
	Leer num3
	Si num1 > num2 y num1 > num3 Entonces
		Escribir num1, " Es el número mayor"
	SiNo
		Si num2 > num1 y num2 > num3 Entonces
			Escribir num2, " Es el número mayor."
		SiNo
			Si num3 > num1 y num3 > num1 Entonces
				Escribir num3, " Es el número mayor. "
			FinSi
		FinSi
	FinSi
FinAlgoritmo

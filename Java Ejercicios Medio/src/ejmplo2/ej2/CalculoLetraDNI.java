package ejmplo2.ej2;

import java.util.Scanner;

//Java ejercicios medio
// Calculo letra DNI
// Crea una función para calcular la letra del NIF que le corresponde al número
// de DNI que le
// pasan como parámetro.
// Desde la función principal tendrás que pedir al usuario un número de DNI y
// mostrar la letra
// que le corresponde al usuario haciendo uso de la función anterior.

public class CalculoLetraDNI {

	public static char calculLetraDni(long num) {

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int pDNI;

		pDNI = (int) (num % 23);

		return letras.charAt(pDNI);
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String dni;
		long numero = 0;

		System.out.println("Introduce tu DNI por favor: ");
		dni = keyboard.nextLine();

		try {
			numero = Long.parseLong(dni);
			System.out.print("Al num tuyo de DNI: " + dni + " corresponde a la letra:	" + calculLetraDni(numero));

		} catch (NumberFormatException e) {
			System.out.print("Este no es el formato correcto de DNI.");
		}
	}

}
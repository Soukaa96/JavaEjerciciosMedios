package ejmplo2.ej2;

import java.util.Scanner;

public class PasarSubcadenaMayúsculas {
//Crea una función que reciba dos cadenas de caracteres y que devuelva la primera cadena, pero
	// transformando en mayúsculas la parte que coincide con la segunda cadena
	// introducida.
	// Desde la función principal se pedirán las dos cadenas y se mostrará el
	// resultado que devuelva
	// la función de arriba.

	public static String cadenasMayusculas(String cadena1, String cadena2) {

		cadena2.toUpperCase();
		return cadena2;
	}

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		String pCadena;
		String sCadena;

		System.out.println("Introduce la primera cadena por favor : ");
		pCadena = Keyboard.nextLine();

		System.out.println("Introduce la segunda cadena por favor : ");
		sCadena = Keyboard.nextLine();

		System.out.println("la segunda cadena en mayusculas es : " + cadenasMayusculas(pCadena, sCadena.toUpperCase()));
	}

}

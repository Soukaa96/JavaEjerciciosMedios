package ejmplo2.ej2;

import java.util.Scanner;

public class EliminaEspaciosBlancoDeUnaFrase {
//Crea una función que reciba como parámetro una cadena y devuelva la cadena eliminando los
	// espacios en blanco que hay en ella.
	// Pruébala pidiendo al usuario que introduzca una frase desde la función
	// principal y mostrándola
	// sin espacios utilizando dicha función.

	public static String espaciosEliminados(String fraseCon) {
		String fraseSin = "";

		int i = 0, j;

		do {
			j = fraseCon.indexOf(" ", i);
			if (j != -1) {
				fraseSin = fraseSin + fraseCon.substring(i, j);
				i = j + 1;
			} else {
				fraseSin = fraseSin + fraseCon.substring(i, fraseCon.length());
			}
		} while (j != -1);

		return fraseSin;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String fraseConn;

		EliminaEspaciosBlancoDeUnaFrase frase = new EliminaEspaciosBlancoDeUnaFrase();

		System.out.println("Introduce una frase con espacios : ");
		fraseConn = keyboard.nextLine();

		System.out.println("la frase sin espacios sera : " + frase.espaciosEliminados(fraseConn));

	}

}

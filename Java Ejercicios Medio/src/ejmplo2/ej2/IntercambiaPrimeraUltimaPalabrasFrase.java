package ejmplo2.ej2;

import java.util.Scanner;

import ejmplo2.ej2.IntercambiaPrimeraUltimaPalabrasFrase;

public class IntercambiaPrimeraUltimaPalabrasFrase {
//Esta función divide la frase en tres partes:
// 1. primera palabra
// 2. desde la segunda palabra hasta la penúltima
// 3. última palabra
// y devuelve la frase poniendo las partes en el orden 3-2-1
	static String cambiar(String frase) {

		String issusA, issusB, issusC;

		if (frase.indexOf(" ") != -1) {
			issusA = frase.substring(0, frase.indexOf(" "));
			issusB = frase.substring(frase.indexOf(" "), frase.lastIndexOf(" ") + 1);
			issusC = frase.substring(frase.lastIndexOf(" "), frase.length());
			return issusC + issusB + issusA;
		} else {

			return frase;
		}

	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String frase;
		System.out.println("Introduce una frase de tres palabras o cuatro al menos : ");
		frase = keyboard.nextLine();

		System.out.println("Frase intercambiada primeras y últimas palabras: " + cambiar(frase));
	}
}
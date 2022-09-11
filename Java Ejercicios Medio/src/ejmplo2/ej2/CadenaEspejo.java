package ejmplo2.ej2;

import java.util.Scanner;

public class CadenaEspejo {
//Crea una función que reciba una cadena de caracteres y la devuelva invertida con efecto
	// espejo, esto es, se concatena a la palabra original su inversa, compartiendo
	// la última letra, que
	// hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante
	// que hacia atrás.
	// Desde la función principal se pedirá al usuario que introduzca una cadena y
	// haciendo uso de
	// dicha función se le mostrará su correspondiente cadena espejo.

	public static String palabraInversa(String cadenaMia) {

		int x;
		String cadenaIinversa = "";

		for (x = cadenaMia.length(); x != 0; x--) {
			cadenaIinversa = cadenaIinversa + cadenaMia.substring(x - 1, x);
		}
		return cadenaMia + cadenaIinversa;
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String cadenaMiaa;

		CadenaEspejo palabra = new CadenaEspejo();

		System.out.println("Introduce una cadena de palabras : ");
		cadenaMiaa = keyboard.nextLine();

		System.out.println("la palabra origin y su palabra inversa : " + palabra.palabraInversa(cadenaMiaa));

	}

}

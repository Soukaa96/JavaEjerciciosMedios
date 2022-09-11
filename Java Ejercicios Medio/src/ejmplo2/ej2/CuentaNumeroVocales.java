package ejmplo2.ej2;

import java.util.Scanner;

import ejmplo2.ej2.CuentaNumeroVocales;

public class CuentaNumeroVocales {
	static int cuentaNumVocales(String cadena) {
		int total = 0, i;

		
		cadena = cadena.toLowerCase();
		for (i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u') {
				total++;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String cadena;

		System.out.println("Introduce una cadena por favor : ");
		cadena = keyboard.nextLine();

		System.out.println("El total de los vocales de la cadena que has introcido es: " + cuentaNumVocales(cadena));
	}

}

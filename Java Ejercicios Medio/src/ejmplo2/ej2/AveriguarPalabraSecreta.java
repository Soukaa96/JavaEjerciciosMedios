package ejmplo2.ej2;

import java.util.Scanner;

public class AveriguarPalabraSecreta {
//Crea una aplicación que pida al usuario una palabra secreta y, a continuación, tendrá tres
//	oportunidades de adivinarla.
//Si no la acierta en los tres intentos se informará de cuál era la palabra correcta, y si acierta en
//cualquiera de los tres intentos, el programa finalizará indicándo al usuario que ha acertado.

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);

		String palabra;
		int intentos = 3;
		String pSecreta = "soukaina";

		System.out.println("Introduce la palabra secreta por favor : ");
		palabra = Keyboard.nextLine();

		if (palabra.equalsIgnoreCase(pSecreta) && intentos <= 3) {
			System.out.println("la palabra es correcta, Enhorabuena!!!");
		}

		while (!palabra.equalsIgnoreCase(pSecreta) && intentos >= 1) {
			intentos--;
			System.out.println("Error, la palabra no es correcta, te quedan: " + intentos + " intentos ");

			System.out.println("Introduce la palabra de nuevo");

			palabra = Keyboard.nextLine();

			if (palabra.equalsIgnoreCase(pSecreta) && intentos < 3) {
				System.out.println("Correcta. Lo has conseguido en " + intentos + " intentos");
			} else if (!palabra.equalsIgnoreCase(pSecreta) && intentos == 1) {
				System.out.println("Has agotado los intentos");
			}
		}
	}

}

package ejercicio2;

import java.io.IOException;

public class Colaborar {

	public static void main(String[] args) {

		/*
		 * 
		 * Segunda parte: implementa una aplicación, llamada 'colaborar', que lance al
		 * menos 10 instancias de la aplicación "lenguaje". Haciendo que todas ellas,
		 * colaboren en generar un gran fichero de palabras. Cada instancia generará un
		 * número creciente de palabras de 10, 20, 30, … Por supuesto, cada proceso
		 * seguirá escribiendo su palabra en una línea independiente de las otras. Es
		 * decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el
		 * fichero 10 + 20 + 30 + … + 100 = 550 líneas.
		 */
		// Por tanto, cuando ejecute la aplicación 'java Colaborar 10[arg[0]]
		// fichero.txt[arg[1]]', tiene que coger esas 10 instancias de Lenguaje.java
		// e incrementalmente llenar el archivo de palabras. (1+i)*10 -- (1+0)*10=10
		// (1+1)*10 = 20 etc.

		if (args.length == 2 && args[0].matches("\\d\\d*")) {
			try {
				int numlim = Integer.parseInt(args[0]);
				String fileName = args[1];
				int sum = 0;
				for (int i = 0; i < numlim; i++) { // repetir hasta llegar al número de repeticiones indicadas

					int lines = (1 + i) * 10;
					// Cuando i toma valor 0, se crean 10 palabras en el fichero pasado por
					// parámetro args[1]
					// Cuando i toma valor 1, se añaden 20 palabras... etc.

					Runtime.getRuntime().exec("java -jar lenguaje.jar " + lines + " " + fileName);

					System.out.println("Se han generado " + lines + " palabras.");
					sum = sum + lines; // Va sumando hasta alcanzar el total de palabras generadas
				}

				System.out.println("Total palabras generadas: " + sum);


			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}

}

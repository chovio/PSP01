package ejercicio1;

/**
 *La idea es realizar una app que genere números aleatorios  
 *Para ello le tendremos que pasar el número de veces que queramos que los genere.
 * 
 */

import java.util.Random;

/**
 * @author chovio
 *
 */
public class aleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Utilizamos el propio array de la clase main para la entrada de datos ya que
		 * lo haremos por consola y es muy útil. Al ejecutar por comando tendremos que
		 * poner el parámetro que indique el número de veces que queremos que se generen
		 * los aleatorios
		 * 
		 */

		if (args.length == 1 && args[0].matches("\\d\\d*")) { // Si el dato introducido en el parámetro sólo ocupa 1, y
																// es un dígito, entonces

			int iteractions = Integer.parseInt(args[0]);

			// Transformamos el dato a entero y ya se convierte en el número de repeticiones
			// de aleatorios que queremos

			Random randomNum = new Random();// creamos un objeto de Random

			for (int i = 0; i < iteractions; i++) {

				System.out.println(randomNum.nextInt(101));
				/*
				 * hasta qué valor queremos que genere números aleatorios? Hasta 100 inclusive,
				 * por eso 101
				 *
				 */
			}

		} else {

			System.out.println("Los parámetros son incorrectos");

		}

	}

}
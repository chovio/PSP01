# Ejercicio 2

## Primera parte: 
Primera parte: implementa una aplicación que escriba en un fichero indicado por el usuario conjuntos de letras generadas de forma aleatoria (sin sentido real). Escribiendo cada conjunto de letras en una línea distinta. El número de conjuntos de letras a generar por el proceso, también será dado por el usuario en el momento de su ejecución. Esta aplicación se llamará "lenguaje" y como ejemplo, podrá ser invocada así:

java -jar lenguaje 40 miFicheroDeLenguaje.txt

Indicando que se generarán 40 palabras del lenguaje y serán guardadas en miFicheroDeLenguaje.txt

```java

BufferedWriter writer = null;

if (args.length == 2 && args[0].matches("\\d+")) {
	// el primer parámetro debe ser un número, que es el que nos indica el número de
	// repeticiones que queremos.
	// El segundo parámetro será el nombre del archivo "miFicheroDeLenguaje.txt"
	// args[1] = fileName;
	int limiteRepeticiones = Integer.parseInt(args[0]);
	String fileName = args[1];

	try {

		File file = new File(fileName); // creamos un archivo con nombre dado en el parámetro 2

		writer = new BufferedWriter(new FileWriter(file, true));// pongo true para que no elimine el archivo
																		// anterior, si no que añada lineas

		for (int i = 0; i < limiteRepeticiones; i++) {// repetir hasta llegar al número de repeticiones indicadas
			// ahora qué repetimos? El algoritmo de generación de aleatorios.

			Random randomLetter = new Random(); // este objeto Random, generará un caracter aleatorio de la 'a'
			// a la 'z',
			// Por lo que ahora necesitamos un aleatorio que indique cuántas letras necesita
			// generar en cada línea:
			Random numOfLetters = new Random();

			// Además, una cadena de caracteres que será la palabra generada por
			// concatenación de los diferentes caracteres.
			String oneLetter;
			String stWord = "";

			/*
			 * ¿Cómo funciona?
			 *
			 * En un bucle, desde i = 7 (número mínimo de caracteres) hasta 15 (num máximo),
			 * se concatenan en una cadena caracteres aleatorios generados 'randomLetter' de
			 * 0 + 'a' hasta 26+'a';
			 * 
			 */
			int numOfLettersInt = numOfLetters.nextInt(8) + 8;

			for (int j = 0; j < numOfLettersInt; j++) {

				oneLetter = Character.toString((char) (randomLetter.nextInt(26) + 'a'));
				stWord = stWord + oneLetter;

			} // Fin último for

			writer.write(stWord + "\n");// Cada palabra que la escriba y me añada un salto de línea
			System.out.println(stWord + " - || longitud de palabra :" + stWord.length() + " letras.");

			// Muestra la palabra generada

		} // Fin for
	
		if (file.exists()) {
			
			System.out.println("El archivo se ha creado en: " + file.getAbsolutePath().toString());
			//Para ver dónde se ha generado el archivo
		}
		
	} catch (Exception e) {
	
		e.printStackTrace();
		
	} finally {
			
		writer.close();
	}
		
} else System.out.println("Error en parámetros.");

```

![Captura Lenguaje](http://subirimagen.me/uploads/20181124103101.png)



## Segunda Parte:
Segunda parte: implementa una aplicación, llamada 'colaborar', que lance al menos 10 instancias de la aplicación "lenguaje". 
Haciendo que todas ellas, colaboren en generar un gran fichero de palabras. 
Cada instancia generará un número creciente de palabras de 10, 20, 30, … 
Por supuesto, cada proceso seguirá escribiendo su palabra en una línea independiente de las otras. 
Es decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el fichero 10 + 20 + 30 + … + 100 = 550 líneas.

```java 
if(args.length == 2 && args[0].matches("\\d\\d*")) {	
  try {
							
	  for(int i=0;i<Integer.parseInt(args[0]); i++) { //repetir hasta llegar al número de repeticiones indicadas
		  int lines = (1+i)*10;						
		  Runtime.getRuntime().exec("java Lenguaje.java " + lines + " " + args[1] );
						
		}
						
  }catch(Exception e) {
				
	e.printStackTrace();			
			
}
```

![Captura Colaborar](http://subirimagen.me/uploads/20181124103319.png)

![Captura archivos creados](http://subirimagen.me/uploads/20181124103412.png)

## Meta

Javier Salgado Tenreiro

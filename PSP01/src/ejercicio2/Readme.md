# Ejercicio 1

## Primera parte: 
Primera parte: implementa una aplicación que escriba en un fichero indicado por el usuario conjuntos de letras generadas de forma aleatoria (sin sentido real). Escribiendo cada conjunto de letras en una línea distinta. El número de conjuntos de letras a generar por el proceso, también será dado por el usuario en el momento de su ejecución. Esta aplicación se llamará "lenguaje" y como ejemplo, podrá ser invocada así:

java -jar lenguaje 40 miFicheroDeLenguaje.txt

Indicando que se generarán 40 palabras del lenguaje y serán guardadas en miFicheroDeLenguaje.txt

```java

//(char)(random.nextInt(26)+'a'); 
//
//convierte a caracter un número de 0 a 26 sumado al valor de "a" que por tanto será el comienzo.
//Los char tienen su equivalente numérico.
//Es decir, si 'a' le sumamos 0, nos devolverá 'a'. Si le sumamos 1 'b', y suscesivamente hasta la z.
		
//Qué nos pide el ejercicio? 
		
//Ejecutar 'java -jar lenguaje 40 miFicheroDeLenguaje.txt', por tanto hay que pasar dos parámetros
		
//String fileName = null;//"miFicheroDeLeguaje.txt"
BufferedWriter writer = null;
			
if(args.length == 2 && args[0].matches("\\d+")) {
	//el primer parámetro debe ser un número, que es el que nos indica el número de repeticiones que queremos.
	//El segundo parámetro será el nombre del archivo "miFicheroDeLenguaje.txt"
	//args[1] = fileName;
			
}
try {
			
	File file = new File(args[1]); //creamos un archivo con nombre dado en el parámetro 2
			
  writer = new BufferedWriter(new FileWriter(file, true));//pongo true para que no elimine el archivo anterior, si no que añada lineas
  for(int i=0;i<Integer.parseInt(args[0]); i++) { //repetir hasta llegar al número de repeticiones indicadas
	//ahora qué repetimos? El algoritmo de generación de aleatorios.
		
	Random randomLetter = new Random(); //este objeto Random, generará un caracter aleatorio de la 'a' a la 'z',
	//Por lo que ahora necesitamos un aleatorio que indique cuántas letras necesita generar en cada línea:
	Random numOfLetters = new Random();
		
	//Además, una cadena de caracteres que será la palabra generada por concatenación de los diferentes caracteres.
	String oneLetter;
	String stWord = "";
		
	/*
	 *¿Cómo funciona?
	 *
	 * En un bucle, desde i = 7 (número mínimo de caracteres) hasta 15 (num máximo), se concatenan en una cadena
	 * caracteres aleatorios generados 'randomLetter' de 0 + 'a' hasta 26+'a';
	 * 
	 */
	int numOfLettersInt = numOfLetters.nextInt(8)+8;
	
	for(int j = 0; j < numOfLettersInt; j++ ) {
				
		oneLetter = Character.toString((char)(randomLetter.nextInt(26)+'a'));
		stWord = stWord + oneLetter;
		
	}
	
	writer.write(stWord+"\n");//Cada palabra que la escriba y me añada un salto de línea
	System.out.println(stWord+" - || longitud de palabra :" + stWord.length()+ " letras.");
			
	//Muestra la palabra generada
			
		
				
	}
			
	
			
}catch(Exception e) {
			
	e.printStackTrace();			
}finally {
	writer.close();
}
```

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
## Historial de versiones

* 0.2.1
    * CAMBIO: Actualizada la documentación (el módulo de código permanece igual)
* 0.2.0
    * CAMBIO: Eliminado `setDefaultXYZ()`
    * AÑADIDO: Añadido `init()`
* 0.1.1
    * ARREGLADO: Cuelgue cuando se llama a `baz()` (Gracias a  @NombreDelAmableContribuidor!)
* 0.1.0
    * La primera release
    * CAMBIO: Renombrado `foo()` a `bar()`
* 0.0.1
    * Trabajo en progreso

## Meta

Tu nomre – [@TuTwitter](https://twitter.com/dbader_org) – TuEmail@example.com

Distribuido bajo la licencia XYZ. Ver ``LICENSE`` para más información.

[https://github.com/yourname/github-link](https://github.com/dbader/)

[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics

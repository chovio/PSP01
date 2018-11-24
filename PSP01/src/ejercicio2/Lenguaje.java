package ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lenguaje {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
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
	}

}

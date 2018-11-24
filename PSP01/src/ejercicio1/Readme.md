# Ejercicio 1

## Primera parte: 
Implementa una aplicación que ordena un conjunto indeterminado de números que recibe a través de su entrada estándar; y muestra el resultado de la ordenación en su salida estándar. La aplicación se llamará 'ordenarNumeros'.


```java

try {
//Dado que esta aplicación tomará los números generados por otra, no me entretendré en realizar la entrada mediante teclado.
			
	InputStreamReader input = new InputStreamReader(System.in);//Creamos la entrada
	BufferedReader bufferInput = new BufferedReader(input);//El buffer
	String stInput = null;		//La cadena en donde se almacena la entrada.
			
	ArrayList<Integer> integerList = new ArrayList<Integer>(); //Lista de números para poder ordenarlos mediante "sort"
			
	while((stInput = bufferInput.readLine()) != null ) { //Validación de entrada.
				
		if(!stInput.matches("\\d\\d*")) {//validación de que el String pueda ser un dígito.
					
			System.out.println("Entrada de datos incorrecta. No es un dígito.");
			return;
				
		}
		integerList.add(Integer.parseInt(stInput));//Transformamos el scInput (String) en entero para añadirlo a la colección y poder ordenarlo.
	}
	bufferInput.close();//Cerramos todo
	input.close();
	Collections.sort(integerList);//Ordenamos
			
	for (int i: integerList) {
		System.out.println(i);//Imprimimos la lista ordenada.
			
	}
			
}catch(IOException e) {
			
	e.printStackTrace();
	}
		
}
```

## Segunda Parte:
Implementa una aplicación, llamada "aleatorios" que genere al menos 40 números aleatorios (entre 0 y 100), y que los escriba en su salida estándar.
```java 
if(args.length == 1 && args[0].matches("\\d\\d*")) { 
//Si el dato introducido en el parámetro sólo ocupa 1, y es un dígito, entonces
			
	int iteractions = Integer.parseInt(args[0]);
			
	//Transformamos el dato a entero y ya se convierte en el número de repeticiones de aleatorios que queremos
			
	Random randomNum = new Random();//creamos un objeto de Random
			
	for(int i=0; i<iteractions; i++) {
				
	System.out.println(randomNum.nextInt(101));
	/*
	 * hasta qué valor queremos que genere números aleatorios?
	 * Hasta 100 inclusive, por eso 101
	 *
	 */
}
			
}else {
			
	System.out.println("Los parámetros son incorrectos");
			
}
```
## Ejecución:

![Captura de pantalla](http://subirimagen.me/uploads/20181120111456.png)

## Meta

Javier Salgado Tenreiro – javisalgadotenreiro@gmail.com



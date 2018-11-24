package ejercicio2;

public class Colaborar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Segunda parte: implementa una aplicación, llamada 'colaborar', que lance al menos 10 instancias de la aplicación "lenguaje". 
		 * Haciendo que todas ellas, colaboren en generar un gran fichero de palabras. Cada instancia generará un número creciente 
		 * de palabras de 10, 20, 30, … Por supuesto, cada proceso seguirá escribiendo su palabra en una línea independiente de las otras. 
		 * Es decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el fichero 10 + 20 + 30 + … + 100 = 550 líneas.
		 */
		//Por tanto, cuando ejecute la aplicación 'java Colaborar.java 10[arg[0]] fichero.txt[arg[1]]', tiene que coger esas 10 instancias de Lenguaje.java
		//e incrementalmente llenar el archivo de palabras. (1+i)*10 -- (1+0)*10=10 (1+1)*10 = 20 etc.
		
		if(args.length == 2 && args[0].matches("\\d\\d*")) {	
			try {
							
				for(int i=0;i<Integer.parseInt(args[0]); i++) { //repetir hasta llegar al número de repeticiones indicadas
					int lines = (1+i)*10;						
					Runtime.getRuntime().exec("java Lenguaje.java " + lines + " " + args[1] );
						
					}
				
				
				
			}catch(Exception e) {
				
				e.printStackTrace();			
			
			}
			
		}
		
		
	}

}

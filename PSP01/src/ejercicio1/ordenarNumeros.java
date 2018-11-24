package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * La idea es coger una lista y ordenar los números de menor a mayor
 * La lista la llenaremos con la de números aleatorios generada en 
 * la otra clase
 */


public class ordenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader bufferInput = new BufferedReader(input);
			String stInput = null;		
			
			ArrayList<Integer> integerList = new ArrayList<Integer>();
			
			while((stInput = bufferInput.readLine()) != null ) {
				
				if(!stInput.matches("\\d\\d*")) {
					
					System.out.println("Entrada de datos incorrecta. No es un dígito.");
					return;
					
				}
				integerList.add(Integer.parseInt(stInput));
			}
			bufferInput.close();
			input.close();
			Collections.sort(integerList);
			
			for (int i: integerList) {
				System.out.println(i);
				
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}

package com.seck.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {


		Escibiendo myFil = new Escibiendo();
		
		myFil.escribir();

	}

}

class Escibiendo{
	
	public void escribir(){
		
		String frase = "Hola de Nuevo" ;
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/Jelias/workspace/Practicas/tests.txt", true);
			BufferedWriter myBuffer = new BufferedWriter(escritura);
			
			myBuffer.write(frase);
			myBuffer.flush();
			
			/*for(int i = 0; i<frase.length();i++){
				
				escritura.write(frase.charAt(i));
				
			}*/
			
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
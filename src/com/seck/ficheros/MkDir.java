package com.seck.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MkDir {

	public static void main(String[] args) {
		
		File myFile = new File("Nueva.txt");
		
		String ruta = myFile.getAbsolutePath();
		
		System.out.println(myFile.getAbsolutePath());
		
		//myFile.mkdir();
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Write access = new Write();
		
		access.write(ruta);
		
		//myFile.delete();

	}

}

class Write{
	
	public void write(String ruta){
		
		String frase = "HOLA MUNDO";
		
		try {
			
			FileWriter myWrite = new FileWriter(ruta, true);
			
			myWrite.write(frase);  //escribe todo una linea
			
			/*for(int i = 0; i < frase.length(); i++){  //Escribe caracter por caracter
				
				myWrite.write(frase.charAt(i));
				
			}*/
			
			myWrite.flush();
			
			myWrite.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
}

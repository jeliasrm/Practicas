package com.seck.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {

		LeerFichero myFile = new LeerFichero();
		myFile.lee();

	}

}

class LeerFichero{
	
	public void lee(){
		
		//FileReader entrada = null;
		
		try {
			FileReader entrada = new FileReader("C:/Users/Jelias/workspace/Practicas/test.txt");
			
			BufferedReader myBuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while(linea != null){
				
				linea = myBuffer.readLine();
				if(linea != null)
					System.out.println(linea);
				
			}
			
			//int c = entrada.read();
			/*int c = 0;
			
			while(c!=-1){
				c=entrada.read();
				char letra = (char) c;
				System.out.print(letra);
			}*/
			
			entrada.close();
			myBuffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.print("ERROR");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.print("ERROR");
			//e.printStackTrace();
		}/*finally {
			
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
		
		
	}
	
}
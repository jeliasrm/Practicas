package com.seck.ficheros;

import java.io.*;

public class DirectorioFichero {

	String file;
	
	public static void main(String[] args) {

		File myFile = new File("Nueva");
		
		System.out.println(myFile.getAbsolutePath());
		
		/*System.out.println(myFile.exists());
		
		System.out.println(myFile.isDirectory());
		
		System.out.println(myFile.isFile());*/
		
		String[] lista = myFile.list();
		
		String[] subfolder;
		
		for(int i =0; i<lista.length; i++){
			
			File f = new File(myFile.getAbsolutePath(), lista[i]);
			
			System.out.println(f);
			
			if(f.isDirectory()){
				
				subfolder = f.list();
				
				for(int j =0; j<lista.length; j++){
					
					if(f.isDirectory())
						System.out.println(subfolder[j]);
					
				}
			
			}
		
		}
		
	}

}

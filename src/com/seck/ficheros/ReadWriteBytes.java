package com.seck.ficheros;

import java.io.*;

public class ReadWriteBytes {

	public static void main(String[] args) {
		
		int count = 0;
		
		int data_Read[] = new int[4327173];

		try {
			
			FileInputStream readFile = new FileInputStream("C:/Users/Jelias/workspace/Practicas/img.jpg");
			
			boolean final_ar = false;
			
			while(!final_ar){
				
				int byte_entrada = readFile.read();
				
				if(byte_entrada != -1)
					
					data_Read[count] = byte_entrada;
				
				//if(byte_entrada == -1)
				else
					
					final_ar = true;
				
				//System.out.println(array[count]);
				
				count++;
				
			}
			
			System.out.println(count);
			
			readFile.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		writeDataFile(data_Read);
		

	}
	
	static void writeDataFile(int data_File[]){
		
		try {
			
			FileOutputStream myWrite = new FileOutputStream("C:/Users/Jelias/workspace/Practicas/img2.jpg");
		
			for(int i = 0; i < data_File.length; i++){
				
				myWrite.write(data_File[i]);
				
			}
			
			myWrite.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}




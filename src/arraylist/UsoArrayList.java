package arraylist;

import java.io.*;

public class UsoArrayList {
	
	//String nombre_persona;

	public static void main(String[] args) {
		
		ArrayList archivos = new ArrayList(5);
		
		archivos.add("Juan");
		
		archivos.add("Jose");
		
		archivos.add("Luis");
		
		archivos.add("Mari");
		
		archivos.add(new File("TEST.txt"));
		
		String nombre_persona = (String) archivos.get(4); //no podemos ver el ultimo elemneto ya que es otro tipo de objeto
		
		/*archivos.add(new File("TEST.txt"));
		
		File nombre_persona = (File) archivos.get(0);*/ //se tiene que hacer siempre casteo en clases genericas
		
		System.out.println(nombre_persona);
	}

}

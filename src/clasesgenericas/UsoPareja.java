package clasesgenericas;

public class UsoPareja {

	public static void main(String[] args) {

		Pareja<String> una = new Pareja<>();
		
		una.setPrimero("Hola Mundo");
		
		System.out.println(una.getPrimero());
		
		Persona pers1 =  new Persona("Juan");
		
		Pareja<Persona> dos = new Pareja<>();
		
		dos.setPrimero(pers1);
		
		System.out.println(dos.getPrimero());
		

	}

}

class Persona{
	
	String nombre;
	
	public Persona(String nombre){
		
		this.nombre = nombre;
		
	}
	
	public String toString(){
		
		return nombre;
		
	}
	
}

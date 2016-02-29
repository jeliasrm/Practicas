package com.seck.collections;

import java.util.HashMap;
import java.util.Map;

public class PruebaMapa {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("1", new Empleado("Juan"));
		
		personal.put("2", new Empleado("Paco"));
		
		personal.put("3", new Empleado("Pedro"));
		
		personal.put("4", new Empleado("Julio"));
		
		System.out.println(personal);
		
		//personal.remove("3");
		
		System.out.println(personal);
		
		personal.put("2", new Empleado("HOLA"));
		
		System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> p : personal.entrySet()){
			
			if(p.getKey() == "1"){
				
				p.setValue(new Empleado("MUNDO"));
				
			}
			
			String clave = p.getKey();
			
			Empleado valor = p.getValue();
			
			System.out.println("Clave: " + clave + ", Valor: " + valor);
			
		}

	}

}

class Empleado{
	
	private String nombre;
	
	private double sueldo;
	
	public Empleado(String n){
		
		nombre = n;
		
		sueldo = 2000;
		
	}
	
	public String toString(){
		
		return "[Nombre:" + nombre + ", Sueldo: " + sueldo + "]";
		
	}
	
}
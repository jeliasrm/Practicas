package com.seck.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("Juan");
		
		personas.add("Pedro");
		
		personas.add("Paco");
		
		System.out.println(personas.size());
		
		personas.add("Paco");
		
		personas.addFirst("PRIMERO");
		
		personas.add(3, "TRES");
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("HOLA");
		
		for(String p : personas){
			
			System.out.println(p);
			
		}

	}

}

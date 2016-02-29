package com.seck.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {

	public static void main(String[] args) {
		
		/*TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Juan");
		
		ordenaPersonas.add("Pedro");
		
		ordenaPersonas.add("Amanda");
		
		for(String s : ordenaPersonas){
		
			System.out.println(s);
			
		}*/
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		
		Articulo segundo = new Articulo(2, "Segundo Articulo");
		
		Articulo tercero = new Articulo(3, "Tercer Articulo");
		
		Articulo cuarto = new Articulo(4, "Cuarto Articulo");
		
		TreeSet<Articulo> it = new TreeSet<Articulo>();
		
		it.add(tercero);
		
		it.add(primero);
		
		it.add(segundo);
		
		it.add(cuarto);
		
		for(Articulo a : it){
			
			System.out.println(a.getDescripcion());
			
		}
		
		System.out.println();
		
		/*Articulo comparador = new Articulo();
		
		TreeSet<Articulo> it2 = new TreeSet<Articulo>(comparador);*/
		
		//Comparador compara_art = new Comparador();
		
		//TreeSet<Articulo> it2 = new TreeSet<Articulo>(compara_art);
		
		TreeSet<Articulo> it2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
			
			public int compare(Articulo o1, Articulo o2) {

				String desc1 = o1.getDescripcion();
				
				String desc2 = o2.getDescripcion();
				
				return desc1.compareTo(desc2);
			}
			
		});
		
		it2.add(tercero);
		
		it2.add(primero);
		
		it2.add(segundo);
		
		it2.add(cuarto);
		
		for(Articulo a : it2){
			
			System.out.println(a.getDescripcion());
		}

	}

}

class Articulo implements Comparable<Articulo>{ // Comparator<Articulo>{
	
	private int num_art;
	
	private String descripcion;
	
	/*public Articulo(){
		
	}*/
	
	public Articulo(int num, String desc) {

		num_art = num;
		
		descripcion = desc;
		
	}
	
	public String getDescripcion(){
		
		return descripcion;
		
	}

	@Override
	public int compareTo(Articulo o) {
		
		return num_art - o.num_art;
	
	}

	/*@Override
	public int compare(Articulo o1, Articulo o2) {

		String descripcionA = o1.getDescripcion();
		
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
		
	}*/	
	
}

class Comparador implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {

		String desc1 = o1.getDescripcion();
		
		String desc2 = o2.getDescripcion();
		
		return desc1.compareTo(desc2);
	}
	
}
package com.seck.collections;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Alfonso Huida", "00001", 200000);
		
		Cliente cl2 = new Cliente("Juan Lopez", "00002", 250000);
		
		Cliente cl3 = new Cliente("Jorge Gonzalez", "00003", 300000);
		
		Cliente cl4 = new Cliente("Alejandro Magno", "00004", 500000);
		
		Cliente cl5 = new Cliente("Alfonso Huida", "00001", 200000);
		
		Cliente cl6 = cl2;
			
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		
		clientesBanco.add(cl2);
		
		clientesBanco.add(cl3);
		
		clientesBanco.add(cl4);
		
		clientesBanco.add(cl5);
		
		clientesBanco.add(cl5);
		
		clientesBanco.add(cl6);
		
		/*for(Cliente cliente : clientesBanco){
			
			System.out.println(cliente + "  " + cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
			
		}*/
		
		Iterator<Cliente> it;
		
		it = clientesBanco.iterator();
		
		while(it.hasNext()){
			
			String nombre_cliente = it.next().getNombre();
			
			if(nombre_cliente.equals("Jorge Gonzalez"))
				
				it.remove();
			
		}
		
		Iterator<Cliente> it2;
		
		it2 = clientesBanco.iterator();
		
		while(it2.hasNext()){
			
			String nombre_cliente = it2.next().getNombre();
			
			System.out.println(nombre_cliente);
			
		}

	}

}

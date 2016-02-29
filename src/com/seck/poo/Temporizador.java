package com.seck.poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class Temporizador {

	public static void main(String[] args) {

		GiveHour listener = new GiveHour(); //aunque no se declaro constructor en clase se utiliza el constructor por default
		//ActionListener listener = new GiveHour(); instancia directa de la interfaz a traves de la clase
		
		Timer myTimer = new Timer(3000, listener);
		
		myTimer.start();
		
		JOptionPane.showMessageDialog(null, "Aceptar para salir", "Attention", 3);
		
		System.exit(0);
		
		
	}

}

class GiveHour implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		Date now = new Date();
		
		System.out.println(now);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}

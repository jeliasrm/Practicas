package com.seck.poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;


import java.awt.Toolkit;

public class TestTemporizador {

	public static void main(String[] args) {

		//Clock myClock = new Clock(2000, true); inner class
		
		Clock myClock = new Clock();//local class
		
		myClock.enMarcha(2000, true);
		
		JOptionPane.showMessageDialog(null, "Adios", "Warnung", 2);
		
		System.exit(0);

	}

}

class Clock{
	
	
	//CODIGO INECESARIO AL TENER UNA LOCAL CLASS
	/*private int interval;
	
	private boolean sound;
	
	public Clock(int interval, boolean sound){
		
		this.interval = interval;
		
		this.sound = sound;
		
	}*/
	
	public void enMarcha(int interval, final boolean sound){  //para utilizar el parametro en local clas debe ser final
		
		class GiveHour2 implements ActionListener { //LocalClass

			@Override
			public void actionPerformed(ActionEvent e) {

				Date now = new Date();
				
				System.out.println(now);
				
				if(sound)
					
					Toolkit.getDefaultToolkit().beep();

			}

		}
		
		ActionListener listener = new GiveHour2();
		
		Timer myTimer = new Timer(interval, listener);
		
		myTimer.start();
		
		
	}
	
	
	/*private class GiveHour2 implements ActionListener { //inner Class

		@Override
		public void actionPerformed(ActionEvent e) {

			Date now = new Date();
			
			System.out.println(now);
			
			if(sound)
				
				Toolkit.getDefaultToolkit().beep();

		}

	}*/
	
}
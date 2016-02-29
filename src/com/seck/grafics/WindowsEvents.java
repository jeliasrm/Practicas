package com.seck.grafics;

import javax.swing.JFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class WindowsEvents {
	
	public static void main(String[] args){
		
		WindowsFrame myWindowsFrame = new WindowsFrame();
		
		myWindowsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//WindowsFrame myWindowsFrame2 = new WindowsFrame();
		
		//myWindowsFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		myWindowsFrame.setTitle("Windows 1");
		
		//myWindowsFrame2.setTitle("Windows 2");
		
		myWindowsFrame.setBounds(150, 150, 600, 150);
		
		//myWindowsFrame2.setBounds(400, 400, 600, 150);
		
	}
	
}

class WindowsFrame extends JFrame {
	
	public WindowsFrame(){
		
		//setTitle("Windows Events");
		
		//setBounds(300,300,600,400);
		
		setVisible(true);
		
		//WindowsF2 myWindowsF = new WindowsF2();
		
		//addWindowListener(myWindowsF);
		
		//addWindowListener(new WindowsF());
		
		addWindowStateListener(new WindowsF3());
		
	}
	
}

class WindowsF3 implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("Ventana cambio Estado");
		
		System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH)
			
			System.out.println("Ventana Maximizada");
		
	}
	
}

class WindowsF2 extends WindowAdapter { //clases adaptadoras
	
	public void windowIconified(WindowEvent e) {

		System.out.println("Ventana Minimizada");
		
	}
	
}

class WindowsF implements WindowListener{ 

	@Override
	public void windowOpened(WindowEvent e) {

		System.out.println("Ventana Abierta");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("Ventana Cerrando");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("Ventana Cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {

		System.out.println("Ventana Minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {

		System.out.println("Ventana Activa");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

		System.out.println("Ventana Desactivada");
		
	}
	
	
}
package com.seck.grafics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WriteFrame {

	public static void main(String[] args) {

		Frame myFrame = new Frame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame extends JFrame{
	
	public Frame(){
		
		setVisible(true);
		
		setSize(650,450);
		
		setLocation(400,200);
		
		setTitle("First Frame");
		
		Panel myPanel = new Panel();
		
		add(myPanel);
		
		
	}
	
}

class Panel extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g); //llamada metodo de la clase padre
		
		//g.drawString("JAVA SWING", 300, 100);
		
	}
	
}
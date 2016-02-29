package com.seck.grafics;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CentralFrames {

	public static void main(String[] args) {
		
		CentralFrame myFrame2 = new CentralFrame();
		
		myFrame2.setVisible(true);
		
		myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class CentralFrame extends JFrame{
	
	public CentralFrame(){
		
		Toolkit my_screen = Toolkit.getDefaultToolkit();
		
		Dimension size_screen = my_screen.getScreenSize();
		
		setBounds(size_screen.width/4, size_screen.height/4, size_screen.width/2, size_screen.height/2);
		
		Image my_icon = my_screen.getImage("icono.jpg");
		
		setIconImage(my_icon);
		
	}
	
}

package com.seck.grafics;

import java.awt.Frame;

import javax.swing.*;

public class Frames {

	public static void main(String[] args) {

		MyFrame frame1 = new MyFrame();
		
		frame1.setVisible(true);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrame extends JFrame{
	
	public MyFrame(){
		
		 /*setSize(500,300);
		 
		 setLocation(200,300);*/
		 
		setBounds(500, 300, 600, 600);
		
		setResizable(true); //redimenzionar
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); maximizar
		
		setTitle("My Windows");
		 
		
	}
	
}

package com.seck.grafics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestActions {

	public static void main(String[] args) {

		ButtonFrame2 myFrame = new ButtonFrame2();
		
		myFrame.setVisible(true);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class ButtonFrame2 extends JFrame{
	
	public ButtonFrame2(){
		
		setTitle("Buttons & Events");
		
		setBounds(300, 300, 600, 400);
		
		ButtonPanel2 myPanel2 = new ButtonPanel2();
		
		
		add(myPanel2);
		
	}
	
}

class ButtonPanel2 extends JPanel {//implements ActionListener{
	
	JButton buttonBlue = new JButton("Blue");
	
	JButton buttonRed = new JButton("Red");
	
	JButton buttonGray = new JButton("Gray");
	
	public ButtonPanel2(){
		  
		add(buttonBlue);
		
		add(buttonRed);
		
		add(buttonGray);
		
		BackgroudColors2 blue = new BackgroudColors2(Color.blue);
		
		BackgroudColors2 red = new BackgroudColors2(Color.red);
		
		BackgroudColors2 gray = new BackgroudColors2(Color.gray);
		
		buttonBlue.addActionListener(blue);
		
		buttonRed.addActionListener(red);
		
		buttonGray.addActionListener(gray);
	}
	
	
	private class BackgroudColors2 implements ActionListener {
		
		private Color background;
		
		public BackgroudColors2(Color c) {

			background = c;
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			setBackground(background);
			
		}
		
	}
	
}

class ActionColor extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
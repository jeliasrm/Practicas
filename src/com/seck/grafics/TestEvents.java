package com.seck.grafics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.SelectableChannel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestEvents {

	public static void main(String[] args) {

		ButtonFrame myFrame = new ButtonFrame();
		
		myFrame.setVisible(true);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class ButtonFrame extends JFrame{
	
	public ButtonFrame(){
		
		setTitle("Buttons & Events");
		
		setBounds(300, 300, 600, 400);
		
		ButtonPanel myPanel = new ButtonPanel();
		
		
		add(myPanel);
		
	}
	
}

class ButtonPanel extends JPanel {//implements ActionListener{
	
	JButton buttonBlue = new JButton("Blue");
	
	JButton buttonRed = new JButton("Red");
	
	JButton buttonGray = new JButton("Gray");
	
	public ButtonPanel(){
		  
		add(buttonBlue);
		
		add(buttonRed);
		
		add(buttonGray);
		
		BackgroudColors blue = new BackgroudColors(Color.blue);
		
		BackgroudColors red = new BackgroudColors(Color.red);
		
		BackgroudColors gray = new BackgroudColors(Color.gray);
		
		buttonBlue.addActionListener(blue);
		
		buttonRed.addActionListener(red);
		
		buttonGray.addActionListener(gray);
		
		/*buttonBlue.addActionListener(this);
		
		buttonRed.addActionListener(this);
		
		buttonGray.addActionListener(this);
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object buttonPress = e.getSource();
			
			if(buttonPress == buttonBlue)

				setBackground(Color.BLUE);
			
			else if(buttonPress == buttonRed)
				
				setBackground(Color.RED);
			
			else
				setBackground(Color.GRAY);
			
		}*/
		
	}
	
	
	private class BackgroudColors implements ActionListener {
		
		private Color background;
		
		public BackgroudColors(Color c) {

			background = c;
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			setBackground(background);
			
		}
		
	}
	
}



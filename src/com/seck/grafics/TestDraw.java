package com.seck.grafics;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TestDraw {

	public static void main(String[] args) {
		
		DrawFrame myFrame2 = new DrawFrame();
		
		myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class DrawFrame extends JFrame{
	
	public DrawFrame(){
		
		setTitle("Drawing");
		
		setBounds(300, 300, 600, 400);
		
		setVisible(true);
		
		PanelDraw myDraw = new PanelDraw();
		
		//myDraw.setBackground(Color.GRAY.brighter());
		
		//myDraw.setBackground(SystemColor.window);
		
		add(myDraw);
		
		myDraw.setForeground(Color.RED);
		
	}
	
}

class PanelDraw extends Panel{
	
	public void paintComponent(Graphics g1){
		
		super.paintComponent(g1);
		
		/*g.drawLine(0,0,700,400);
		
		g.drawRect(50, 50, 200, 200);
		
		g.drawArc(0, 0, 500, 200, 45, 360);
		
		g.drawRoundRect(0, 0, 200, 100, 360, 360);*/
		
		Graphics2D g2 = (Graphics2D) g1;
		
		Rectangle2D rect = new Rectangle2D.Double(100,100,200,150);
		
		//g2.setPaint(Color.BLUE);
		
		g2.draw(rect);
		
		Ellipse2D ellipse = new Ellipse2D.Double(0, 0, 300, 150);
		
		//g2.draw(ellipse);
		
		ellipse.setFrame(rect);
		
		g2.draw(ellipse);
		
		double center_x = rect.getCenterX(), center_y = rect.getCenterY();
		
		double radio = 125;
		
		Ellipse2D circle = new Ellipse2D.Double();
		
		circle.setFrameFromCenter(center_x, center_y, center_x + radio, center_y + radio);
		
		g2.draw(circle);
		
		g2.fill(ellipse);
		
		Font myFont = new Font("Verdana", Font.BOLD, 46);
		
		setFont(myFont);
		
		g2.drawString("JAVA", 100, 100);
	}
	
}

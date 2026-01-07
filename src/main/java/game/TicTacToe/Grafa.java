package game.TicTacToe;

import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JComponent;

public class Grafa extends JComponent  {

	public void paint (Graphics g) {
		 int w = getWidth();
		 int h = getHeight();
		 
		 int dw = w/3;
		 int dh = h/3;
		 
		 g.setColor(Color.BLUE);
		 
		 for(int i=1;i<3;i++) {
			 g.drawLine(0, dh * i, w, dh* i);
			 g.drawLine( dw * i,0, dw * i, h);
		 }
		
		
}
	
}
package game.TicTacToe;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

public class Grafa extends JComponent  {
	
	
	
	public Grafa() {
		//событие от нажатия 
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);	
	}
	
  protected void processMauseEvent(MouseEvent mouseEvent) {
	  super.processMouseEvent(mouseEvent);
  }
  
  @Override
  protected void paintComponent(Graphics graphics) {
  super. paintComponent(graphics);
  drawGrid(graphics);

  }
  
		 void drawGrid(Graphics graphics) {
		 int w = getWidth(); // ширина игрового поля
		 int h = getHeight(); // высота игрового поля
		 int dw = w / 3; // делим ширину на 3 - получаем ширину одной ячейки
		 int dh = h / 3; // делим высоту на 3 - получаем высоту одной ячейки
		 graphics. setColor(Color.BLUE); // цвет линий
		 for (int i = 1; i < 3; i++) // i пробегает значения от 1 до 2 включительно (при i = 3) выход из цикла
		 graphics.drawLine( 0, dh * i, w, dh * i); // горизонтальная линия
		 graphics.drawLine( dw * i,0, dw * i, h);; // вертикальная линия

}
	
}
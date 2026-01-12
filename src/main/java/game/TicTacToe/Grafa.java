package game.TicTacToe;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

public class Grafa extends JComponent  {
	public static final int FIELD_EMPTY = 0;//пустое поле
	public static final int FIELD_X = 10; // поле с крестиком
	public static final int FIELD_0 = 200; // поле с ноликом
	int[][] field; // объявляем наш массив игрового поля
	boolean isXturn;

	
	
	public Grafa() {
		//событие от нажатия 
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		field = new int[3][3]; // выделям память под массив при создании компонента
		initGame();

	}
	
	
	public void initGame() {
	for (int i = 0; i < 3; ++i) {
	for (int j = 0; j < 3; ++j) {
	field[i][j] = FIELD_EMPTY; // очищаем массив, заполняя его 0
	}
	}
	isXturn = true;
	}
	//получает событие 
	@Override
	protected void processMouseEvent(MouseEvent mouseEvent) {
	super.processMouseEvent(mouseEvent);
	
	if(mouseEvent.getButton() == MouseEvent.BUTTON1) {
	int x = mouseEvent.getX(); // координата х клика
	int y = mouseEvent.getY(); // координат у клика
	// переводим координаты в индексы ячейки в массиве field
	int i = (int) ((float) x / getWidth() * 3);
	int j = (int) ((float) y / getHeight() * 3);
	//проверям, что выбранная ячейка пуста и туда можно сходить
	if (field[i][j] == FIELD_EMPTY) {
	//проверка чей ход, если - ставим крестик, если 0 - ставим нолик
	field[i][j] = isXturn?FIELD_X:FIELD_0;
	isXturn = !isXturn; // меняем флаг хода.
	repaint(); // перерисовка компонента, это вызовет метод paintComponent()
	    }
	  }
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
		 for (int i = 1; i < 3; i++) { // i пробегает значения от 1 до 2 включительно (при i = 3) выход из цикла
		 graphics.drawLine( 0, dh * i, w, dh * i); // горизонтальная линия
		 graphics.drawLine( dw * i, 0, dw * i, h);; // вертикальная линия

}
	
}
}
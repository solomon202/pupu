package game.TicTacToe;

import game.TicTacToe.Grafa;

import javax.swing.JFrame;

public class Game {

	public Game(){
		  System.out.println("GO GAME");
	}
	
	public void start() {
		JFrame frame = new JFrame("GAME TIC.TAC.TOE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(350,350);
		Grafa graf = new Grafa();
		frame.add(graf);
		frame.setVisible(true);
		
	}
	}





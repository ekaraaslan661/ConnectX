import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;

import java.util.*;

/**
 * This class represents the gamescreen on which the game will be played
 * 
 *
 */
public class GamePanel extends JPanel implements KeyListener, MouseListener
{

	private String message;
	private Main m;
	private Actor[][] board;

	/**
	 * This represents the characteristics of the gamescreen
	 * @param m This is a reference to the Main window
	 */
	public GamePanel (Main m) {
		super();
		this.m = m;
		board = new Actor[6][7];
		setBackground(Color.WHITE);
		message = "This is the game screen! Press escape to quit.";
	}

	/**
	 * This class does everything that involves the graphical component of the screen
	 * @param g A graphics object that is utilized to use the functions of the Graphics class
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

		Graphics2D g2 = (Graphics2D)g;

		int width = getWidth();
		int height = getHeight();

		double ratioX = (double)width/800.0;
		double ratioY = (double)height/600.0;

		AffineTransform at = g2.getTransform();
		g2.scale(ratioX, ratioY);
		g2.setTransform(at);

		for(int i = 0; i <= 6; i++) {
			g.drawLine((int) (width / 6.0),(int) (height / 7.0 * i), (int) (width - width / 6.0), (int) (height / 7.0 * i));
		}
		
		for(int i = 0; i <= 7; i++) {
			g.drawLine((int) ,(int) , (int) , (int) );
		}

		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				Actor a = board[i][j];
				if(a instanceof Piece) {
					g.setColor(((Piece) a).getColor());
					g.fillOval((int) (width / 6.0 * i), (int) (height / 7.0 * j), 50, 50);
				} 
			}
		}




		// TODO Add any custom drawings here
	}

	/**
	 * This method tests for if a key was pressed and helps to determine what to do next
	 * @param arg0 Represents the KeyEvent to be checked against
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
			m.changePanel("1");
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}

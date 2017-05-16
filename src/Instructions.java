import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;
/**
 * This class represents the instructions to the game
 * @author ekaraaslan661
 *
 */
public class Instructions extends JPanel implements KeyListener{

	private String message;
	private Main m;
/**
 * Holds the contents of the instructions
 * @param m a reference to Main
 */
	public Instructions (Main m) {
		super();
		this.m = m;
		setBackground(Color.WHITE);
		message = "I'll put the instructions later. Lolmao";
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

		g.setColor(Color.BLACK);
		g.setFont(new Font("SansSerif",Font.BOLD,28));
		int strWidth = g.getFontMetrics().stringWidth(message);
		g.drawString(message, 400-strWidth/2, 300);

		g2.setTransform(at);

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
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

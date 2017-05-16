import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

/**
 * Represents the options to which panel to choose
 * @author ekaraaslan661
 *
 */
public class OptionPanel extends JPanel implements ActionListener {
	
	private Main w;
	private JButton button, button2;
	private Image mainBackground;
	/**
	 * Represents the characteristics of the OptionPanel
	 * @param w a refernece to Main
	 */
	public OptionPanel(Main w) {
		this.w = w;
		JPanel p = new JPanel();
		p.setBackground(new Color(0,0,0,0));  // Panel is transparent
		
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));	
		p.add(Box.createVerticalStrut(300));   // Move down by 300 pixels  
		
		mainBackground = (new ImageIcon("connect.png")).getImage();
		
		button = new JButton("Press to have Fun!");
		button2 = new JButton("Press for instructions!");

		button.addActionListener(this);
		p.add(button);
		add(p);
		button2.addActionListener(this);
		p.add(button2);
		add(p);
	}
	/**
	 * This class does everything that involves the graphical component of the screen
	 * @param g A graphics object that is utilized to use the functions of the Graphics class
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		double ratioX = getWidth() / 800.0;
		double ratioY = getHeight() / 600.0;
		
		Graphics2D g2 = (Graphics2D)g;
		
		AffineTransform af = g2.getTransform();
		
		g2.scale(ratioX,ratioY);
		g.drawImage(mainBackground, 0, 0, 800, 600, this);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 45));
		g.drawString("ConnectX", 305, 200);
		
		g2.setTransform(af);
	}
	/**
	 * Checks if a button pressed and if it was switches the panel based off of which button was pressed
	 * @param e the ActionEvent to be checked against
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button)) {
			w.changePanel("2");
		} else if(e.getSource().equals(button2)) {
			w.changePanel("3");
		}
	}
	
}
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Holds the main method and other characteristics of the project
 * @author ekaraaslan661
 *
 */
public class Main extends JFrame{
//Make a 2D array in GamePanel that holds tiles. Tiles will be another class and those hold a value
// that is either 0,1,2. According to each click it will drop a tile into the space and the board will fill up
	
private JPanel cardPanel;
	/**
	 * Holds the characteristics of the Main class
	 * @param title This represents the name of the window
	 */
	public Main(String title) {
		super(title);
		setBounds(100, 100, 800, 600);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    cardPanel = new JPanel();
	    CardLayout cl = new CardLayout();
	    cardPanel.setLayout(cl);
	    
		OptionPanel panel1 = new OptionPanel(this);    
	    GamePanel panel2 = new GamePanel(this);
	    Instructions panel3 = new Instructions(this);
	    cardPanel.add(panel1,"1"); // Card is named "1"
	    cardPanel.add(panel2,"2"); // Card is named "2"
	    cardPanel.add(panel3, "3");
	    add(cardPanel);
	    addKeyListener(panel2);
	    addKeyListener(panel3);
	
	    setVisible(true);
	}

	public static void main(String[] args)
	{
		Main w = new Main("ConnectX");
	}
  /**
   * This method changes the panel according to what cardPanel holds
   * @param name the name of the panel
   */
	public void changePanel(String name) {
		((CardLayout)cardPanel.getLayout()).show(cardPanel,name);
		requestFocus();
	}

	
	
	
	
}

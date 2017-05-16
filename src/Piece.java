import java.awt.Color;

public class Piece extends Actor{

	private int value;
	private Color color;
	
	public Piece(Color color) {
		this.color = color;
	}
	
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
}

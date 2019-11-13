import java.awt.Color;
import java.awt.Graphics;


public class Player extends GameObject {
public int speed;
	public Player(int X, int Y, int Width, int Height) {
		super(X, Y, Width, Height);
		speed = 10;
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
	
	}
	

	public void moveLeft() {
		x = x - speed;
	}
	public void moveRight() {
		x = x + speed;
	}
	public void draw(Graphics visuals) {
		visuals.setColor(Color.BLUE);
		visuals.fillRect(x,y,width,height);
	}

	
}


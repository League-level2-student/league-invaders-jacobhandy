import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	public int x;
	public int y;
	int width;
	int height;
	boolean isAlive;
	Rectangle collisionBox;
	public GameObject(int X, int Y, int Width, int Height) {
	isAlive = true;
		x = X;
		y = Y;
		width = Width;
		height = Height;
		collisionBox = new Rectangle(x, y, width, height);
		
	}
	void update() {
		
		collisionBox.setBounds(x, y, width, height);
	}
	void draw(Graphics visuals) {
		
	}
	public static void repaint() { 
		// TODO Auto-generated method stub
		
	}
}

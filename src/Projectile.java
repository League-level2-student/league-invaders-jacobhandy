import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
int speed;
	public Projectile(int X, int Y, int Width, int Height) {
		
		super(X, Y, Width, Height);
		// TODO Auto-generated constructor stub
		speed = 10;
	}
	public void update() {
		y = y - speed;
		if(y < 0) {
			isAlive = false;
		}
	}
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
		y-=speed;
	}
}

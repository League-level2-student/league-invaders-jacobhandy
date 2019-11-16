import java.awt.Graphics;

public class Alien extends GameObject{

	public Alien(int X, int Y, int Width, int Height) {
		super(X, Y, Width, Height);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		y++;
	}
	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}

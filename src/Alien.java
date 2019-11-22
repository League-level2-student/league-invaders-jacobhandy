import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	public Alien(int X, int Y, int Width, int Height) {
		super(X, Y, Width, Height);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		super.update();
		//Complete challenge: add unique movement pattern
		y = y + 2;
	/*	for(int a = 0; a < 2; a++) {
			
			if(a > 10) {
				a = -10;
				x--;
			}
			if(a > -1) {
				x++;
			}
		}
		*/
	}
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(x, y, width, height);
	}
}

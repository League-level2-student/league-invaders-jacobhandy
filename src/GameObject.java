import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	public GameObject(int X, int Y, int Width, int Height) {
		x = X;
		y = Y;
		width = Width;
		height = Height;
	}
	static void update() {
		
	}
	void draw(Graphics visuals) {
		 visuals.fillRect(10, 10, 100, 100);
	}
	public static void repaint() {
		// TODO Auto-generated method stub
		
	}
}

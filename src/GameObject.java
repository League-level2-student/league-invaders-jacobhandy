import java.awt.Graphics;

public class GameObject {
	public int x;
	public static int y;
	int width;
	int height;
	public GameObject(int X, int Y, int Width, int Height) {
		x = X;
		y = Y;
		width = Width;
		height = Height;
	}
	static void update() {
		y = y -100;
		System.out.println("oihfjaopghvcdfahjtoirewhjfjb o;ailntm");
	}
	void draw(Graphics visuals) {
		 visuals.fillRect(x, y, 100, 100);
	}
	public static void repaint() { 
		// TODO Auto-generated method stub
		
	}
}

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Player RocketShip;
	
	
	
	public ObjectManager(Player p) {
		
		RocketShip = p;
	}
	
	public void update() {
		RocketShip.update();                        
	}
	public void draw(Graphics g) {
		RocketShip.draw(g);
	}
}

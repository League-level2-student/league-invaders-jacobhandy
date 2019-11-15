import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Player RocketShip;
	
	 
	
	public ObjectManager(Player p) {
		
		RocketShip = p;
	}
	ArrayList<Projectile> bullets = new ArrayList<Projectile>();
	public void update() {
		RocketShip.update();                        
	}
	public void draw(Graphics g) {
		RocketShip.draw(g);
		for (Projectile p : bullets) {
			p.draw(g);
		}
	}
	public void addProjectile(Projectile projectile) {
		bullets.add(1, projectile);
	}
}

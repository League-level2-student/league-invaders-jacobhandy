import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Player RocketShip;
	//Alien Xenomorph;
	 
	
	public ObjectManager(Player p) {
		
		RocketShip = p;
	}
	ArrayList<Projectile> bullets = new ArrayList<Projectile>();
	ArrayList<Alien> enemies = new ArrayList<Alien>();
	public void update() {
		RocketShip.update();   
		//Xenomorph.update();
	}
	public void draw(Graphics g) {
		RocketShip.draw(g);
		//Xenomorph.draw(g);
		for (Projectile p : bullets) {
			p.draw(g);
		}
	}
	public void addProjectile(Projectile projectile) {
		bullets.add(0, projectile);
	}
	public void addAlien(Alien alien) {
		enemies.add(0, alien);
	}
	public long enemyTimer = 0;
	int enemySpawnTime = 1000;
public void manageEnemies(){
        
		if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.frameWidth), 0, 50, 50));

                enemyTimer = System.currentTimeMillis();
        }
	
		
}
	public void purgeObjects() {
		enemies.remove(0);
	}

}

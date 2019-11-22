import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Player RocketShip;

	public ObjectManager(Player p) {

		RocketShip = p;
	}

	ArrayList<Projectile> bullets = new ArrayList<Projectile>();
	ArrayList<Alien> enemies = new ArrayList<Alien>();

	public void update() {
		RocketShip.update();
		for (Alien a : enemies) {
			a.update();
		}
			for(Projectile p: bullets) {
				p.update();
			}
	}

	public void draw(Graphics g) {
		RocketShip.draw(g);

		for (Alien a : enemies) {
			a.draw(g);
		}

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

	public void manageEnemies() {

		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.frameWidth), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}

	}

	
	public void purgeObjects() {
		
			
				for(int a = 0; a < enemies.size(); a++) {
					if(enemies.get(a).isAlive == false) {
						enemies.remove(a);
						for(int x = 0; x < bullets.size(); x ++) {
							if(bullets.get(x).isAlive == false) {
								bullets.remove(x);
							}
						}
					}
				}
				
			}
		
	

	public void checkCollision() {
		for (Alien a : enemies) {
			for (Projectile p : bullets) {
				if (a.collisionBox.intersects(p.collisionBox)) {
					System.out.println("oof");
					a.isAlive = false;
					p.isAlive = false;
				}
			}
			if (RocketShip.collisionBox.intersects(a.collisionBox)) {

				RocketShip.isAlive = false;

			}

		}

	}
}

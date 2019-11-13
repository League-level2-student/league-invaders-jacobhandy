import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener{
    Timer t;
    GameObject test;
    
    final int MENU_STATE = 1;
    Font titleFont;
    final int GAME_STATE = 2;
    final int END_STATE = 3;
    int currentState = 1;
    Player player = new Player(250,700,50,50);
	public GamePanel () {
		t = new Timer(1000 / 60, this);
		titleFont = new Font("Comic Sans", Font.PLAIN, 48);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  if(currentState == MENU_STATE){

              updateMenuState();

      }else if(currentState == GAME_STATE){

              updateGameState();

      }else if(currentState == END_STATE){

              updateEndState();

      }
	}
	void startGame() {
		t.start();
	}
	 @Override
	 
	 public void paintComponent(Graphics g){
		  if(currentState == MENU_STATE){

              drawMenuState(g);

      }else if(currentState == GAME_STATE){

              drawGameState(g);

      }else if(currentState == END_STATE){

              drawEndState(g);

      }
	                 }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ENTER) {
			
			
			if(currentState < END_STATE) {
					currentState++;
					System.out.println(currentState);
				
			}	
			else if(currentState >= END_STATE){
				System.out.println(currentState);
	            currentState = MENU_STATE;

			}
		}
	
	//movement for player
		//move left
		if(keyCode == KeyEvent.VK_LEFT) {
			//works
			player.moveLeft();
		}
		//move right
		if(keyCode == KeyEvent.VK_RIGHT) {
			player.moveRight();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Epic Gamer Moment");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Luke! Stay after class!");
	}
    public void updateMenuState() {
    		drawMenuState(getGraphics());
    }
    public void updateGameState() {
    		drawGameState(getGraphics());
    		player.update();
    }
    public void updateEndState() {
    		drawEndState(getGraphics());
    }
    public void drawMenuState(Graphics g) {
    	g.setColor(Color.BLUE);
    	//System.out.println("welcome");
    	g.fillRect(0, 0, LeagueInvaders.frameWidth, LeagueInvaders.frameHeight);   
    	g.setFont(titleFont);
    	g.setColor(Color.WHITE);
    	g.drawString("League Invaders!", 60, 200);
    	g.drawString("Press Enter", 65, 500);
    }
public void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);
	//System.out.println("Lick");
	g.fillRect(0, 0, LeagueInvaders.frameWidth, LeagueInvaders.frameHeight);
	player.draw(getGraphics());
    }
public int enemiesKilled = 0;
public void drawEndState(Graphics g) {
	g.setColor(Color.RED);
	//System.out.println("dick");
	g.fillRect(0, 0, LeagueInvaders.frameWidth, LeagueInvaders.frameHeight);  
	g.setFont(titleFont);
	g.setColor(Color.BLACK);
	g.drawString("Game Over ;(", 0, 200);
	g.drawString("You killed " + enemiesKilled + " enemies", 0, 400);
}
}



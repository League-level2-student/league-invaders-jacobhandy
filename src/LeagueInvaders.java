import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	public static int frameWidth = 500;
	public static int frameHeight = 800;
	public static JFrame mainFrame;
	static GamePanel window;
	public LeagueInvaders() {
		mainFrame = new JFrame();
		window = new GamePanel();
	}
  public static void createWindow() {
    	    Dimension d = new Dimension(frameWidth, frameHeight);
		
		mainFrame.setSize(d);
		mainFrame.setTitle("League Invaders! (Space Invaders ripped off of us!)");
}
  public static  void setup() {
	  mainFrame.add(window);
	  mainFrame.getContentPane().setPreferredSize(new Dimension(frameWidth, frameHeight));
	  mainFrame.pack();
	  createWindow();
	  mainFrame.setVisible(true);
	  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  mainFrame.addKeyListener(window);
	  window.startGame();
  }
}
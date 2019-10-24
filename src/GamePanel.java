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
	public GamePanel () {
		t = new Timer(1000 / 60, this);
		test = new GameObject(0,0,500,800);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		GameObject.update();
		GameObject.repaint();
	}
	void startGame() {
		t.start();
	}
	 @Override
	 
	 public void paintComponent(Graphics g){
		test.draw(g);
	                 }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ms. Knowles is a bot");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Epic Gamer Moment");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Luke! Stay after class!");
	}


}


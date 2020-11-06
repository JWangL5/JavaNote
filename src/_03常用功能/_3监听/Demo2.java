
package _03常用功能._3监听;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Demo2 extends JFrame {
	
	MyPanel mp = null;
	public Demo2(){
		mp = new MyPanel();
		this.add(mp);
		this.addKeyListener(mp);
		this.setSize(200,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 demo2 = new Demo2();
	}

}

class MyPanel extends JPanel implements KeyListener {
	
	int x = 10;
	int y = 10;
	
	public void paint(Graphics g){
		super.paint(g);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode()==KeyEvent.VK_UP){
			this.y--;
		}else if(arg0.getKeyCode()==KeyEvent.VK_DOWN){
			this.y++;
		}else if(arg0.getKeyCode()==KeyEvent.VK_LEFT){
			this.x--;
		}else if(arg0.getKeyCode()==KeyEvent.VK_RIGHT){
			this.x++;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

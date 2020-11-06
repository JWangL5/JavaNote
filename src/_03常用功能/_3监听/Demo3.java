/**
 * 编写事件处理类[事件监听者]
 * 根据需要给事件处理类实现监听器接口
 * 在事件处理类中重写事件处理方法
 * 注册监听，在事件源类中指定事件监听器[响应者]
 * 
 * 总结：
 * 事件发生的地方和处理的地方还是分开的【委托机制】
 * 事件是分类的（鼠标，键盘，窗口……），根据需要来实现接口、重写处理方法
 */

package _03常用功能._3监听;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Demo3 extends JFrame{
	
	MP mp = null;
	public Demo3(){
		mp = new MP();
		this.add(mp);
//		this.addMouseListener(mp);
//		this.addKeyListener(mp);
//		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 demo2_4 = new Demo3();
	}
}

class MP extends JPanel 
implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	
	public void paint(Graphics g){
		super.paint(g);

	}

	//MouseListener
	@Override
	//被点击
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("鼠标点击了 x="+arg0.getX()+"y="+arg0.getY());
	}

	@Override
	//移动到Panel上
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("鼠标来了");	
	}

	@Override
	//离开Panel
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("鼠标走了");
	}

	@Override
	//鼠标被按下
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	//鼠标被释放
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	//KeyListener
	@Override
	//键盘被按下
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+"被按下");
	}

	@Override
	//被松开
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//输入了……
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	//MouseMotionListener


	@Override
	//鼠标拖动
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	


	@Override
	//鼠标移动
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标当前坐标"+e.getX());
	}


	//WindowListener
	@Override
	//窗口激活
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
		
	}


	@Override
	//窗口关闭
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("窗口关闭 windowClosed");
		
	}

	@Override
	//关闭
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
	}


	@Override
	//与激活相反的东西？
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
		
	}


	@Override
	//最小化
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}


	@Override
	//打开
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
	}
	
	
}
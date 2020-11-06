package _03常用功能._2图形界面;


import java.awt.*;
import javax.swing.*;

public class Demo1_13 extends JFrame {

	MyPanel mp = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_13 demo1_13 = new Demo1_13();

	}

	public Demo1_13(){
		mp = new MyPanel();
		this.add(mp);

		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel{

	//覆盖JPanel中的paint方法
	//Graphics是一个用于绘图的类[相当于一个画笔]
	//在窗体大小变化时、最大化最小化时、repaint()被调用时 paint()函数被自动调用
	public void paint(Graphics g){
		//调用父类函数，完成初始化任务
		super.paint(g);
//		System.out.println("paint被调用");
//		g.drawOval(40, 40, 30, 30);
//		g.drawLine(10, 10, 40, 40);//直线
//		g.drawRect(40, 40, 60, 40);//矩形
		g.setColor(Color.BLUE);
//		g.fillRect(50, 50, 80, 60);

//		Image im =
//				Toolkit.getDefaultToolkit().getImage
//				(Panel.class.getResource("/fly.jpg"));
//		g.drawImage(im, 50, 50,this);

		g.setFont(new Font("微软雅黑",Font.BOLD,30));
		g.drawString("祖国万岁", 100, 100);

	}

}
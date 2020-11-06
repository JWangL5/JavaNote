package _03常用功能._3监听;
/**
 * 事件监听的学习
 * 
 * 时间：2014年3月9日13:37:54
 * @author Administrator
 * 
 * 流程总结：
 * 1.引包，实现相应接口[KeyListener,ActionListener,MouseListener,WindowListener]
 * 2.重写相应的处理方法（Override）
 * 3.注册监听[在事件源处addXXXListener]
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Demo1 extends JFrame implements ActionListener{
	
	JButton jb1,jb2;
	JPanel jp1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 jt = new Demo1();

	}
	
	public Demo1(){
		jb1 = new JButton("红色");
		jb1.addActionListener(this);//注册监听
		jb1.setActionCommand("红色");//指定Action命令
		
		jb2 = new JButton("黑色");
		jb2.addActionListener(this);
		jb2.setActionCommand("黑色");
		
		jp1 = new JPanel();
		jp1.setBackground(Color.BLACK);
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(jp1);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(200,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("红色")){
			jp1.setBackground(Color.RED);
		}else if(e.getActionCommand().equals("黑色")){
			jp1.setBackground(Color.BLACK);
		}else {}
		
	}

}
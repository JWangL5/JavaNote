/**
 * 实战案例
 * JSplitPane（拆分窗格组件）
 */


package _03常用功能._2图形界面;

import java.awt.*;

import javax.swing.*;

public class Demo1_9 extends JFrame {

	JSplitPane jsp;
	JList jlt;
	JLabel jll;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_9 demo1_9 = new Demo1_9();

	}
	
	public Demo1_9(){
		
		String []words = {"boy","girl","bird","dog","red","blue"};
		jlt = new JList(words);
		jll = new JLabel(new ImageIcon("images/fly.jpg"));//在JLabel上放置图片
		//拆分窗格
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlt,jll);//水平拆分
		jsp.setOneTouchExpandable(true);//是否可以伸缩隐藏
		
		this.add(jsp);
		
		this.setSize(700,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}

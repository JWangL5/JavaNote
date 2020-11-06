/**
 * 布局管理器的学习
 * 2015年2月12日14:44:21
 * 
 * java提供了五种布局管理器：
 * FlowLayout 流式布局管理器、BorderLayout 边界布局管理器、GridLayout 网格布局管理器
 * CardLayout 卡片布局管理器、GridBagLayout 网格包布局管理器
 * 
 * 【BorderLayout】注意事项：五个部分不一定需要全部添加（中部的大小可以自动调解）
 */


package _03常用功能._2图形界面;

import java.awt.*;
import javax.swing.*;


public class Demo1_2 extends JFrame {

	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5 =null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1_2 demo1_2 = new Demo1_2();

	}
	
	public Demo1_2(){
		
		//创建组件
		jb1 = new JButton("东");
		jb2 = new JButton("西");
		jb3 = new JButton("南");
		jb4 = new JButton("北");
		jb5 = new JButton("中");
		
		//添加组件
		this.add(jb1,BorderLayout.EAST);
		this.add(jb2,BorderLayout.WEST);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.NORTH);
		this.add(jb5,BorderLayout.CENTER);
		
		//设置窗体信息
		this.setTitle("BorderLayout演示");
		this.setSize(300, 200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}

}

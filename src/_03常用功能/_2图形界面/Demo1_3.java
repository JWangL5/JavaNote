/**
 * 【FlowLayout】注意事项：
 * 2015年2月12日15:19:47
 * 
 * 1、不限制他所管理的组件大小，允许他们有最佳大小
 * 2、当容器被缩放时，组件位置会变化（一般情况下是禁止缩放的）
 * 3、流式布局默认是居中对齐，注意右对齐的方式
 */

package _03常用功能._2图形界面;

import java.awt.*;

import javax.swing.*;

public class Demo1_3 extends JFrame {

	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_3 demo1_3 =new Demo1_3();

	}
	
	public Demo1_3(){
		
		jb1=new JButton("—1—");
//		jb1.setSize(100,50);
		//不限制他所管理的组件大小，允许他们有最佳大小
		jb2=new JButton("—2—");
		jb3=new JButton("—3—");
		jb4=new JButton("—4—");
		jb5=new JButton("—5—");
		jb6=new JButton("—6—");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//系统默认是BorderLayout
		//流式布局默认是居中对齐，注意右对齐的方式
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		//设置窗体信息
		this.setTitle("FlowLayout演示");
		this.setSize(300, 200);
		this.setLocation(200,200);
		
		//当容器被缩放时，组件位置会变化（一般情况下是禁止缩放的）
		this.setResizable(false);//禁止用户改变窗体大小
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
	}

}

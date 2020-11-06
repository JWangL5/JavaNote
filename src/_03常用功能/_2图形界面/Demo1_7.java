/**
 * 复选框组件（JCheckBox）、单选框组件（JRadioButton）、ButtonGroup
 */

package _03常用功能._2图形界面;

import java.awt.*;
import javax.swing.*;

public class Demo1_7 extends JFrame {
	
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JButton jb1,jb2;
	JCheckBox jcx1,jcx2,jcx3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_7 demo1_7 = new Demo1_7();

	}
	
	public Demo1_7(){
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();

		jl1 = new JLabel("你喜欢的运动");
		jl2 = new JLabel("性别");
		
		jb1 = new JButton("注册");
		jb2 = new JButton("取消");
		
		jcx1 = new JCheckBox("足球");
		jcx2 = new JCheckBox("篮球");
		jcx3 = new JCheckBox("羽毛球");
		
		bg = new ButtonGroup();
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		bg.add(jrb1);
		bg.add(jrb2);
		
		this.setLayout(new GridLayout(3,1));
		
		this.add(jp1);
		jp1.add(jl1);
		jp1.add(jcx1);
		jp1.add(jcx2);
		jp1.add(jcx3);
		
		this.add(jp2);
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		this.add(jp3);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.setSize(300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

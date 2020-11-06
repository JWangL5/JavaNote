/**
 * 文本框（JTextField）密码框（JPasswordField）标签（JLabel）
 * 
 */

package _03常用功能._2图形界面;

import java.awt.*;
import javax.swing.*;

public class Demo1_6 extends JFrame {

	JTextField jtf;
	JPasswordField jpf;
	JLabel jl1,jl2;
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_6 demo1_6 = new Demo1_6();

	}
	
	public Demo1_6(){

		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jl1 = new JLabel("用户名");
		jl2 = new JLabel("密     码");
		jtf = new JTextField(10);
		jpf = new JPasswordField(10);
		
		jb1 = new JButton("确认");
		jb2 = new JButton("取消");
		
		this.setLayout(new GridLayout(3,1));
		
		this.add(jp1);
		jp1.add(jl1);
		jp1.add(jtf);
		
		this.add(jp2);
		jp2.add(jl2);
		jp2.add(jpf);
		
		this.add(jp3);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.setTitle("登陆");
		this.setSize(300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);

	}

}

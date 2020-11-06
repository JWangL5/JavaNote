/**
 * JTabbedPane 选项卡窗格
 */


package _03常用功能._2图形界面;

import java.awt.*;
import javax.swing.*;

public class Demo1_11 extends JFrame {
	
	//North
	JLabel jl;
	
	//CENTER
	JTabbedPane jtp;
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2,jl3,jl4;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb;//清除号码
	JCheckBox jcb1,jcb2;
	
	//SOUTH
	JButton jb1,jb2;
	JPanel jp;

	public Demo1_11(){
		//NORTH
		jl = new JLabel(new ImageIcon("images/04.png"));
		
		//CENTER
		jtp = new JTabbedPane();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp2.setBackground(Color.GREEN);
		jp3.setBackground(new Color(0,0,225));
		
			//将面板添加到选项卡窗格上
		jtp.add("QQ号码",jp1);
		jtp.add("手机号码",jp2);
		jtp.add("电子邮箱",jp3);
		
		jl1 = new JLabel("QQ号码",JLabel.CENTER);
		jl2 = new JLabel("QQ密码",JLabel.CENTER);
		jl3 = new JLabel("忘记密码",JLabel.CENTER);
		jl3.setFont(new Font("宋体",Font.PLAIN,16));//设置字体样式
		jl3.setForeground(Color.BLUE);//设置字体颜色
		jl4 = new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");
			//移动到字体上时光标变成一个手
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf = new JTextField();
		jpf = new JPasswordField();
		jb = new JButton("CLEAR");
		
		jcb1 = new JCheckBox("隐身登陆");
		jcb2 = new JCheckBox("记住密码");
		
		
		
		//SOUTH
		jp = new JPanel();
		jb1 = new JButton("确认");
		jb2 = new JButton("取消");
		
		
		
		this.add(jl,BorderLayout.NORTH);
		
		this.add(jtp,BorderLayout.CENTER);
		jp1.setLayout(new GridLayout(3,3));
		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jb);
		jp1.add(jl2);
		jp1.add(jpf);
		jp1.add(jl3);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jl4);

		this.add(jp,BorderLayout.SOUTH);
		jp.add(jb1);
		jp.add(jb2);
		
		this.setTitle("登陆");
		this.setSize(400,300);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_11 demo1_11 = new Demo1_11();

	}
	


}

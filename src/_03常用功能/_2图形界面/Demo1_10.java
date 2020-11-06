/**
 * 多行文本框（JTextArea）
 */

package _03常用功能._2图形界面;

import java.awt.*;

import javax.swing.*;

public class Demo1_10 extends JFrame {

	JTextArea jta;
	JPanel jp1;
	JComboBox jcb;
	JTextField jtf;
	JButton jb;
	JScrollPane js;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_10 demo1_10 = new Demo1_10();

	}
	
	public Demo1_10(){
		jta = new JTextArea();
		jp1 = new JPanel();
		String []chatter = {"拉登","布森"};
		jcb = new JComboBox(chatter);
		jtf = new JTextField(10);
		jb = new JButton("发送");
		js = new JScrollPane(jta);
		
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(js);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setIconImage(new ImageIcon("images\\green.jpg").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}

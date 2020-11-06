/**
 * JMenuBar 菜单条组件 JMenu JMenuItem
 */

package _03常用功能._2图形界面;

import java.awt.*;

import javax.swing.*;

public class Demo1_12 extends JFrame{
	
	JMenuBar jmb;
	JMenu jm1,jm2,jm3,jm4,jm5;
	JMenuItem item2,item3,item4,item5,item6,item7;
	//二级菜单
	JMenu jm11;
	JMenuItem file,project;
	
	JTextArea jta;
	
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public Demo1_12(){
		
		//工具条
		jtb = new JToolBar();
		jb1 = new JButton("NEW");
		jb1.setToolTipText("新建");//设置提示信息
		jb2 = new JButton("OPEN");
		jb2.setToolTipText("打开");
		jb3 = new JButton("SAVE");
		jb3.setToolTipText("保存");
		jb4 = new JButton("COPY");
		jb4.setToolTipText("复制");
		jb5 = new JButton("CUT");
		jb5.setToolTipText("剪切");
		jb6 = new JButton("PASTA");
		jb6.setToolTipText("粘贴");
		jtb.add(jb1);jtb.add(jb2);jtb.add(jb3);jtb.add(jb4);jtb.add(jb5);jtb.add(jb6);
		
		//菜单条
		jmb = new JMenuBar();
		jm1 = new JMenu("文件(F)");
		jm1.setMnemonic('F');
		jm2 = new JMenu("编辑(E)");
		jm2.setMnemonic('E');
		jm3 = new JMenu("格式(O)");
		jm3.setMnemonic('O');
		jm4 = new JMenu("查看(V)");
		jm4.setMnemonic('V');
		jm5 = new JMenu("帮助(H)");
		jm5.setMnemonic('H');
		jmb.add(jm1);jmb.add(jm2);jmb.add(jm3);jmb.add(jm4);jmb.add(jm5);
		
//		item1 = new JMenuItem("新建(N)");
		
		jm11 = new JMenu("文件(F)");
		jm11.setMnemonic('F');
		file = new JMenuItem("文件");
		project = new JMenuItem("工程");
		jm11.add(file);
		jm11.add(project);
		
		item2 = new JMenuItem("打开(O)");
		item3 = new JMenuItem("保存(S)");
		item3.setMnemonic('s');
		item4 = new JMenuItem("另存为(A)");
		item5 = new JMenuItem("页面设置(U)");
		item6 = new JMenuItem("打印(P)");
		item7 = new JMenuItem("退出(X)");
		
		jm1.add(jm11);jm1.add(item2);jm1.add(item3);jm1.add(item4);
		jm1.addSeparator();
		jm1.add(item5);jm1.add(item6);
		jm1.addSeparator();
		jm1.add(item7);
		


		
		jta = new JTextArea();
		
		this.setJMenuBar(jmb);
		this.add(jtb,BorderLayout.NORTH);
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.add(jsp);
		
		this.setTitle("记事本");
		this.setSize(600,500);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_12 demo1_12 = new Demo1_12();
		

	}

}

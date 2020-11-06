/**
 * 下拉框组件（JComboBox）、列表组件（JList）、滚动窗格组件（JScrollPane）
 */

package _03常用功能._2图形界面;

import java.awt.*;

import javax.swing.*;

public class Demo1_8 extends JFrame {

	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox jcb1,jcb2;
	JList jlt;
	JScrollPane jsp;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_8 demo1_8 = new Demo1_8();

	}
	
	public Demo1_8(){
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("你的籍贯");
		jl2 = new JLabel("旅游地点");
		
		String[]jg = {"北京","天津","上海","四川","火星","天安门","长城","故宫","九寨沟","颐和园"};
		jcb1 = new JComboBox(jg);
		
		String[]dd = {"天安门","长城","故宫","九寨沟","颐和园","北京","天津","上海","四川","火星"};
		jlt = new JList(dd);
//		jcb2 = new JComboBox(dd);
		jsp = new JScrollPane(jlt);
		jlt.setVisibleRowCount(3);//设置选项的数目
		
		this.setLayout(new GridLayout(2,1));
		

		this.add(jp1);
		jp1.add(jl1);
		jp1.add(jcb1);
		
		this.add(jp2);
		jp2.add(jl2);
		jp2.add(jsp);//注意这里是将JScrollPane放入JPanel
		
		this.setSize(300,180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}

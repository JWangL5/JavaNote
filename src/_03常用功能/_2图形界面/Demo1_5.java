/**
 * 利用JPanel来将布局管理器组合使用
 * 
 * JPanel 的默认布局管理器是 FlowLayout
 */

package _03常用功能._2图形界面;

import java.awt.*;
import javax.swing.*;

public class Demo1_5 extends JFrame {
	
	JPanel jp1,jp2;
	int size=6;
	JButton jbs[]= new JButton[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1_5 demo1_5 = new Demo1_5();

	}
	
	public Demo1_5(){
		
		for(int i=0;i<size;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		this.add(jp1,BorderLayout.NORTH);
		jp1.add(jbs[0]);
		jp1.add(jbs[1]);
		jp1.add(jbs[2]);
		
		this.add(jbs[3],BorderLayout.CENTER);
		
		this.add(jp2,BorderLayout.SOUTH);
		jp2.add(jbs[4]);
		jp2.add(jbs[5]);
		
		this.setSize(300,200);
		this.setLocation(200,200);
		this.setTitle("混合布局");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}

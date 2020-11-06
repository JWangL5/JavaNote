/**
 * GridLayout
 * 2015年2月12日15:21:29
 * 
 * GridLayout注意事项：
 * 
 * 1、组件位置不随窗体的缩放而变化，但大小会变
 * 2、所有组件大小相同
 * 3、利用设置网格布局new GridLayout(4,2,10,5)(几行，几列，水平间距，垂直间距）
 */

package _03常用功能._2图形界面;

import java.awt.*;
import javax.swing.*;

public class Demo1_4 extends JFrame {
	
	//定义组件
	int jbsize=12;
	JButton jbs[]=new JButton[jbsize];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1_4 demo1_4 = new Demo1_4();

	}
	
	public Demo1_4(){
		
		//创建组件
		for(int i=0;i<jbsize;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		
		//设置网格布局(几行，几列，水平间距，垂直间距)
		this.setLayout(new GridLayout(4,2,10,5));
		
		//添加组件
		for(int i=0;i<jbsize;i++){
			this.add(jbs[i]);
		}
		
		this.setTitle("GridLayout");
		this.setSize(300,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}

}

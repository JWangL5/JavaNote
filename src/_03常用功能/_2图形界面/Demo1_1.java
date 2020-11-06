/**
 * 功能：gui界面的学习【一个窗体+一个按钮】
 * 2015年2月12日14:06:35
 * 
 * IDE集成开发环境
 * 常见的开发工具  netbean   Jbuilder  Jcreator  ibm
 * 
 * 【创建窗体的一般流程】
 * 1、继承JFrame
 * 2、定义组建
 * 3、在构造函数中添加组件、设置窗体信息
 * 4、在主函数中创建，运行
 */

package _03常用功能._2图形界面;

import javax.swing.*;

//继承
public class Demo1_1 extends JFrame{
	
//	JFrame JF =new JFrame();//JFrame是一个顶层容器
	
	//定义所需要的组建
	JButton jb = null;
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Demo1_1 demp1_1 = new Demo1_1();


	}
	
	//构造函数，添加组件
	public Demo1_1(){
		
		jb=new JButton("我是按钮");
		this.add(jb);
		
		//设置窗体信息
		this.setTitle("hello,world");//设置标题
		this.setSize(500, 400);//设置大小，以像素（像素是一个密度单位）为单位【横坐标，纵坐标】
		this.setLocation(200,300);//设置初始位置【横坐标，纵坐标】
		//最后运行
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//表示关闭窗体后保证jvm（java虚拟机）也退出
		this.setVisible(true);
	}

}

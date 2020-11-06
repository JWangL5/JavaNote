/**
 * File的使用
 */

package _03常用功能._4文件IO;

import java.io.*;

public class Demo4_1 {

	public static void main(String[] args) {

		//得到文件的基本信息
		File f = new File("D://aa.txt");
		System.out.println("路径："+f.getAbsolutePath());
		System.out.println("大小："+f.length());
		
		//创建文件
		// File f =  new File("d:\\hsp.txt");
		// if(!f.exists()){
			
		// 	try {
		// 		f.createNewFile();
		// 	} catch (IOException e) {
		// 		e.printStackTrace();
		// 	}
		// }else{
		// 	System.out.println("文件存在");
		// }
		
		//创建文件夹,读取文件夹
		File f2 = new File("D:\\英语资料");
		if(f2.isDirectory()){
			System.out.println("文件夹已存在");
		}else{
			f2.mkdir();//创建文件夹
		}
		if(f2.isDirectory()){
			File list[] = f2.listFiles();
			for(int i=0;i<list.length;i++){
				System.out.println(list[i].getName());
			}
		}

	}

}

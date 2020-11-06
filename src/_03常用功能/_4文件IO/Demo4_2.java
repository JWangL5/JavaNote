package _03常用功能._4文件IO;

import java.io.*;

// FileInputStream & FileOutputStream 输入输出

public class Demo4_2 {

	public static void main(String[] args){
		Demo4_2 demo4_2 = new Demo4_2();
//		demo4_2.input();
//		demo4_2.output();

	}

	public void input(){
		File f = new File("d:\\aa.txt");
		FileInputStream fis = null;

		//File没有读写的功能，借助InPutStream
		try {
			fis = new FileInputStream(f);
			byte [] b = new byte[1024];
			int n=0;
			while((n=fis.read(b))!=-1){
				String s = new String(b,0,n);
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{

			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void output(){

		File f = new File("d:\\ss.txt");
		FileOutputStream fos = null;

		try {
			f.createNewFile();
			fos = new FileOutputStream(f);
			String s  = "hello,word";
//			byte[] b = new byte[1024];

			fos.write(s.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

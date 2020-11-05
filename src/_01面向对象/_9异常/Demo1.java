package _01面向对象._9异常;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 异常主要分三类：
 * 检查性异常（编译异常）：文件不存在、UnkownHost等；
 * 运行期异常：数组越界、除以0、传参不规范等；
 * 错误（Error）：内存耗尽等；
 *
 * 异常处理：
 * 【1】捕获异常并当即处理 try...catch...
 * 【2】把异常抛给调用者处理
 */

public class Demo1 {
    public static void main(String[] args) {

        Demo1 d = new Demo1();
        // 抛出的异常必须由上级 try catch 捕获
        // 上级如果继续throws最终会由java虚拟机处理
        try {
            d.throwserror();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void trycatch(){
        try{
            FileReader fr = new FileReader("F:/javacode/a.txt");
            Socket s = new Socket("192.168.1.23", 78);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (UnknownHostException e){
            e.getMessage();
        }catch (Exception alle){
            System.out.println("这样可以捕获所有的异常");
        }finally {
            System.out.println("一定会被执行");
        }
        System.out.println("Here may not be executed");
    }

    public void throwserror() throws IOException {
        FileReader fr = new FileReader("F:/javacode/a.txt");
        Socket s = new Socket("192.168.1.23", 78);
    }

}

package _03常用功能._1线程;

/**
 * 线程是轻量级的进程
 * 线程没有独立的地址空间【内存】
 * 线程是由进程创建的[寄生在进程中]
 * 一个进程拥有多个线程[多线程编程]
 * 五种状态：
 * 		新建[new]、就绪[runnable]、运行[running]、阻塞[blocked]、死亡[dead]
 *
 * 创建方法
 * 继承Thread,重写run方法[Cat]
 * 实现runnable，重写run方法[Dog]
 * 两种方法在本质上没有区别（Thread也是实现了Runnable接口）
 *
 */

public class Demo1 {
    public static void main(String[] args) {
        // 每个对象只能启动一次，多线程需要多个Thread对象
        Cat cat = new Cat();
        cat.start(); // 运行run()函数，开启线程
//        cat.run(); 不可以启动两次

        TicketWin w1 = new TicketWin();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }
}

class Cat extends Thread{
    public void run(){
        while (true){
            try {
                //进入Blocked状态并释放资源
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am a cat!");
        }
    }
}

class TicketWin implements Runnable{

    static int TICKET_NUM = 2000;

    @Override
    public void run() {
        while(true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 使用this作为对象锁，使得其中代码具有原子性
            synchronized (this){
                if(TICKET_NUM>0){
                    System.out.println(Thread.currentThread().getName()+",Success!Remain:"+TICKET_NUM);
                    TICKET_NUM--;
                }
            }

        }
    }
}
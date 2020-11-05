package _01面向对象._10线程;

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
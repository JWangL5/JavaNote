package _01面向对象._5单例;

public class Demo1 {
}

// 饿汉设计模式
class SingleIntance{
    public static SingleIntance sin = new SingleIntance();
    private SingleIntance() { }
    public static SingleIntance getInstance() {
        return sin;
    }

}

// 懒汉设计模式（对内存更友好）
class SingleInstance2{
    public static SingleInstance2 ins;
    private SingleInstance2(){ }
    public static SingleInstance2 getInstance() {
        if(ins == null){
            ins =  new SingleInstance2();
        }
        return ins;
    }
}

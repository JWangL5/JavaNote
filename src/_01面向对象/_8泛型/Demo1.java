package _01面向对象._8泛型;

// jdk 5之后出现的(java 1.5)泛型
// ClassCastException 类型转换异常

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //使用泛型约束其格式强制
        ArrayList<Clerk> arr = new ArrayList<Clerk>();
        System.out.println(arr.size());

        Clerk clk1 = new Clerk("sj",12);
        Clerk clk2 = new Clerk("wy",14);
        arr.add(clk1); arr.add(clk2);
        System.out.println(arr.size());

        //get()默认返回object类型对象，需要强转一下
        Clerk clk = arr.get(0);


        arr.remove(0);
    }
}

class Clerk {
    private String name;
    private int age;

    public Clerk(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
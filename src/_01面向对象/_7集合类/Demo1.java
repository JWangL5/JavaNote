package _01面向对象._7集合类;

// 集合类

import java.util.ArrayList;

/**
 * List结构的集合类：ArrayList，LinkedList(链表)，Vector，Stack
 * Map结构的集合类：HashMap，Hashtable
 * Set结构的集合类：HashSet，TreeSet
 * Queue结构的集合：Queue接口
 */

public class Demo1 {
    public static void main(String[] args) {

    }

    public void byarraylist() {
        ArrayList arr = new ArrayList();
        System.out.println(arr.size());

        Clerk clk1 = new Clerk("sj",12);
        Clerk clk2 = new Clerk("wy",14);
        arr.add(clk1); arr.add(clk2);
        System.out.println(arr.size());

        //get()默认返回object类型对象，需要强转一下
        Clerk clk = (Clerk)arr.get(0);
        for(int i=0;i<arr.size();i++){
            Clerk cleck = (Clerk)arr.get(i);
        }

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

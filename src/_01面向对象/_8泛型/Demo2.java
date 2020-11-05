package _01面向对象._8泛型;

import java.lang.reflect.Method;

/**
 * 泛型主要解决两个问题：
 * 【1】代码重用。在获取类信息后可以使代码适配不同类型数据
 * 【2】安全性问题，强制数据格式，确保代码可以计算成功！
 */

public class Demo2 {
}

class Gen<T>{
    private T o;

    public Gen(T o){
        this.o = o;
    }

    public void showTypeName(){
        System.out.println(o.getClass());
        Method[] m = o.getClass().getDeclaredMethods();
        System.out.println(m);
    }
}
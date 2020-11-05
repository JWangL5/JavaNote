package _02常用类._4Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // 使用静态方法获取实例
        System.out.println(now); // 查看其中包含的所有字段
        System.out.println(now.MONTH); // 错误的获取方法
        System.out.println(now.get(Calendar.MONTH));

        now.add(Calendar.DAY_OF_MONTH, 700);
        Date d = now.getTime();
        System.out.println(d);
    }
}

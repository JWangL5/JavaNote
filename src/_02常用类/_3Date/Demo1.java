package _02常用类._3Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date(); // 不传参的构造方法
        System.out.println(d); // 打印当前时间
        System.out.println(d.getTime()); // 时间毫秒值，from 1970-1-1 00：00
        Date d1 = new Date(d.getTime()+300*1000); // 带参数的构造器

        // DateFormat是一个抽象类，使用其子类进行format
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月d日 HH:mm" );
        System.out.println(sdf.format(d));

        // 使用Locale.English转变为英文格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("E LLL dd HH:mm:ss z YYYY", Locale.ENGLISH);
        Date d2 = sdf2.parse("Wed Nov 04 12:11:46 GMT+08:00 2020");
        System.out.println(sdf2.format(d));
        System.out.println(sdf.format(d2));

    }
}

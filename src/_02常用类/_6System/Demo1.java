package _02常用类._6System;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // System.exit(0); // 0表示正常结束程序
        System.currentTimeMillis(); //获取系统时间

        int[] arrs1 = new int[]{10,20,30,40,50,60,70};
        int[] arrs2 = new int[6];
        System.out.println(Arrays.toString(arrs2));
        System.arraycopy(arrs1,2,arrs2,1,5); // 拷贝数组
        System.out.println(Arrays.toString(arrs2));

    }
}

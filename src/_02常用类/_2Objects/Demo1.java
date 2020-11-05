package _02常用类._2Objects;

import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {
        Student stu = new Student("LB", 18);
        Student stu2 = new Student("LB", 18);
        stu.equals(stu2); // 当stu为空时会报错
        Objects.equals(stu, stu2); // sun公司给提供了一个对比的方法
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

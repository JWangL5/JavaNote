package _02常用类._1Object;

// object.toString()默认返回对象的地址，可以重写
// object.equals()默认判断地址是否相同

import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {
        Student stu = new Student("LB", 18);
        Student stu2 = new Student("LB", 18);
        System.out.println(stu.toString());
        System.out.println(stu.equals(stu2));
    }
}

class Student{
    private String name;
    private int age;

    public Student() { }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

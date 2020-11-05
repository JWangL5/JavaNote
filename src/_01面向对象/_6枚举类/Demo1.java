// 使用枚举类做信息标志和信息分类

package _01面向对象._6枚举类;

public class Demo1<run> {

    public static void main(String[] args) {

    }

    public void run(Orientation orientation){
        switch (orientation){
            case UP:
                System.out.println("上");
            case DOWN:
                System.out.println("下");
            case LEFT:
                System.out.println("左");
            case RIGHT:
                System.out.println("右");
        }
    }
}

// final修饰，不可以修改；多例的，构造器私有，外部不可修改；
enum Sex{
    BOY, GIRL;
}

enum Orientation {
    UP, DOWN, LEFT, RIGHT;
}

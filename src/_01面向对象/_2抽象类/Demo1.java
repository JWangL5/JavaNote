package _01面向对象._2抽象类;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

// abstract class could not be created into objects
// JUST TEMPLATE!
abstract class Animal {
	String name;
	int age;
	// make subclass must override this method
	abstract public void cry();
}

class Cat extends Animal
{
	public void cry()
	{
		System.out.println("èè��");
	}
}

package _01面向对象._4final;

public class Demo1 {
	public static void main(String[] args) {
		Bbb  bb=new Bbb();
		bb.show();	
	}
}

class Aaa {
	int a;
	final float rate=3.1415f;
     public void sendMes(){
		System.out.println("������Ϣ");
	}
    public void show()
    {
    	System.out.println("a");
    }
}

class Bbb extends Aaa {
	public Bbb(){ a++; }
  	public void sendMes()
	{
		System.out.println();
	}
}

interface Fish2 {
	public void swimming();
}

interface Bird {
	public void fly();
}

class Monkey {
	int name;
	public void jump() { System.out.println("���ӻ���"); }
}

class LittleMokey  extends Monkey implements Fish2, Bird {
	public void swimming() { }
	public void fly() { }
}

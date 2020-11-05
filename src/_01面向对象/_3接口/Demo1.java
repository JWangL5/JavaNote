
package _01面向对象._3接口;

public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Computer();
		Camera camera1=new Camera();
		Phone phone1=new Phone();
		computer.useUsb(camera1);
		computer.useUsb(phone1);
	}
}

interface Usb{
	int a=1;
	public abstract void start();
	void stop();
}

class Camera implements Usb {
	public void start()
	{
		System.out.println("�����������ʼ��������");
	}
	public void stop()
	{
		System.out.println("���������ֹͣ��������");
	}
}

class Phone implements Usb {
	public void start()
	{
		System.out.println("�����ֻ�����ʼ��������");
	}
	public void stop() { System.out.println("�����ֻ���ֹͣ��������"); }
}

class Computer {
	public void useUsb(Usb usb)
	{
		usb.start();
		usb.stop();
	}
}

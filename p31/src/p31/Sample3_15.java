package p31;


public class Sample3_15 {
	public static void main(String[] args)
	{
		Car.showSum();
		Car car1=new Car();
		car1.setCar(12234,20.5);
		Car.showSum();
		Car car2=new Car();
		car2.setCar(4567,30.5);
	}
}
class Car
{
	public static int sum=0;
	private int num;
	private double gas;
	public Car()
	{
		num=0;
		gas=0.0;
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	public static void showSum()
	{
		System.out.println("���l�`�@��"+sum+"�x");
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
package p27;

public class Sample3_13 {
	public static void main(String[] args)
	{
		Car car1=new Car();
		car1.show();
		Car car2=new Car();
		car2.show();
	}

}
class Car
{
	private int num;
	private double gas;
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void show()
	{
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
	}
}
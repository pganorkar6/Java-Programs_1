package MockPractice;

public class polymorphism {

	public static void main(String[] args) {
		polymorphism j1=new polymorphism();
		j1.test(50);
		j1.test(20, 400);
		j1.test(50, 50.60f);
		j1.test();

	}
	public void test()
	{
		int a=10;
		int b=15;
		int sum=a+b;
		System.out.println("Addition of a& b is "+sum);
	}
	public void test(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of a&b is "+sum);
	}
	public void test (int a,float b)
	{
		float sum=a+b;
		System.out.println("Addition of a&b is "+sum);
	}
	public void test(int a)
	{
		System.out.println("Value of a is "+a);
	}
}

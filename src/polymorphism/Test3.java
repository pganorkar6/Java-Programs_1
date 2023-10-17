package polymorphism;

public class Test3 extends Test2{

	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.test();
		Test3 t3=new Test3();
		t3.test();
	}
public void test()
{
	System.out.println("This test method from class Test3"); 
}

}

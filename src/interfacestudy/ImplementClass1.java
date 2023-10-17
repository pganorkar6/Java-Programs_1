package interfacestudy;

public class ImplementClass1 implements Pract1,Pract2{

	public static void main(String[] args) 
	{
		ImplementClass1 i1=new ImplementClass1();
		i1.test1();
		i1.test2();
		i1.test4();
		i1.test4();
	}

	@Override
	public void test1() {
		System.out.println("This is test1 method from interfcae ");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("This is test2 method from interfcae ");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("This is test3 method from interfcae ");
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("This is test4 method from interfcae ");
	}

}

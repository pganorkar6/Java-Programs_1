package MockPractice;

public class implementationclass implements interfacePractice,interfacesecond{

	public static void main(String[] args) {
		implementationclass w1=new implementationclass();
		interfacePractice.test1();
		interfacesecond.test3();
      
	}

//	@Override
	//public void test3() {
	//	// TODO Auto-generated method stub
	//	interfacesecond.super.test3();
	//}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		interfacesecond.super.test2();
	}

//	@Override
//	public void test1() {
	//	// TODO Auto-generated method stub
	//	interfacePractice.super.test1();
	}

//}

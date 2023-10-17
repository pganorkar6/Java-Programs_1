package polymorphism;

public class Test1 {

	public static void main(String[] args) {
		Test1 ct=new Test1();
		ct.addition();
		ct.addition(12,12);
        ct.addition(15, 12);
        ct.addition(80, 30, 25);
        
	}
public void addition()
{
int a=10;
int b=5;
int sum=a+b;
System.out.println("Addition of a+b is "+ sum);
}

public void addition(int a,int b)//method with two parameter
{
int sum=a+b;
System.out.println("Addition of a+b is "+ sum);
}

public void addition(int a,float b)//method with two parameter but different variable
{
	float sum=a+b;
	System.out.println("Addition of a+b is "+ sum);	
}
public void addition(int a,int b,int c)
{
int sum=a+b+c;
System.out.println("Addition of a,b,c is "+ sum);
}

}

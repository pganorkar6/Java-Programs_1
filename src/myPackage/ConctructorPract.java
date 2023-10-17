package myPackage;

public class ConctructorPract {
       //Global Variable Declaration
	  int a;
	  int b;
	  int c;
	  int sum;
	  int mul;
	  
	  public ConctructorPract()
	  {
		  a=10;
		  b=20;
		  //c=30
	  }
	  public ConctructorPract(int x)//constructor with single parameter
	  {
		a=x;  
	  }
	  public ConctructorPract(int x,int y)//constructor with two parameter
	  {
		a=x;
		b=y;
	  }
	  public ConctructorPract(int x,int y,int z)//constructor with three parameter
	  {
		a=x;
		b=y;
		c=z;
	  }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConctructorPract m=new ConctructorPract();
		m.addition();
		ConctructorPract m1=new ConctructorPract(90);
		m1.addition();
		ConctructorPract m2=new ConctructorPract(60,50);
		m2.addition();
		ConctructorPract m3=new ConctructorPract(50,60,60);
		m3.addition();
		ConctructorPract a=new ConctructorPract();
		a.multiplication();
		ConctructorPract a1=new ConctructorPract(50);
		a1.multiplication();
		ConctructorPract a2=new ConctructorPract(50,60);
		a2.multiplication();
		ConctructorPract a3=new ConctructorPract(50,60,60);
		a3.multiplication();
	}
public void addition()
{
sum=a+b+c;
System.out.println("The sum of the number is "+sum);
}
public void multiplication()
{
mul=a*b*c;
System.out.println("Multiplication of three number is "+mul);
}
}

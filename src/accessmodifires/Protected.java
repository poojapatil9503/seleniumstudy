package accessmodifires;

public class Protected {
protected int a =52;
protected static int b = 623;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Protected P = new Protected();
		System.out.println("the value of protected nonstatic global value is "+P.a);
		System.out.println("the value of protected static global value is  "+b);
		
		P.test1();
		test2();
		
	}
protected void test1()
{
System.out.println("this is the protected nonstatic test1 method ");	

}
protected static void test2()
{
System.out.println("this is the protected static test2 method");	
}

}

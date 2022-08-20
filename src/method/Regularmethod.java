package method;

public class Regularmethod {
public static void main(String[] args) {
		// TODO Auto-generated method stub
add();	
Regularmethod s =new Regularmethod()	;
s.sub();
s.subs(54, 48);
	
	}
public static void add()
{
	int a = 52;
	float b = 5.6f;
	float add =a+b;
	System.out.println("add = "+ add);
	
}

	public void sub()
	{
		int a = 56;
		int b = 632;
		int sub = a-b;
		System.out.println("subs = "+sub);
	}
	public void subs(int a,int b)
	{
		int sub = a-b;
		System.out.println( "subs = " +sub);
	}
	
}

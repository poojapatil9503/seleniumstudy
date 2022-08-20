package constructor;

public class without {
	int a;
	float b;
	String name;
	public without()
	{
		a = 56;
		b = 6.2f;
		name = "pooja";
		}
public without(int x,float y,String num)
{
	a=x;
	b=y;
	name=num;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
without w = new without();
w.add();
without w1 =new without(56, 58, "mayuri");
w1.add();

	}
public void add()
{
	float add=a+b;
System.out.println(name +" is added the values and addition is "+add);	

}
	
	
}

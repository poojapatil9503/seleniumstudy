package constructor;

import accessmodifires.Protected;

public class AnotherPackage extends Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnotherPackage Ap=new AnotherPackage();
Ap.test1();
System.out.println(Ap.a);

Protected.test2();
System.out.println(Protected.b);
	}

}

package Inheritance;
 class A{
	int a=10;
	int b=20;
}
class B extends A{
	int x = 40;
	int y = 40;
	{
	System.out.println(a+b);
	}
}
public class C extends B {
	{
	System.out.println(x+y);
	{
	System.out.println(a+b);
	}
}
	public static void main(String args[]) {
     C obj = new C();
}
}
package InheritanceExamples;

class A {
int a=10;
int b=20;
public void m1() {
	System.out.println("M1 is executed");
}
}
class B extends A{
	int x=40;
	int y=50;
public void m2() {
	System.out.println("M2 is executed");
	System.out.println(a+b);
}
}
public class C extends B{
	public void m3() {
		System.out.println("M3 is executed");
		System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		C m = new C();
	m.m1();
	m.m2();
	m.m3();
	}
}


package Method;

public class Dt_Var1 {
int b = 30;
public void m1() {
	int a = 10;
	System.out.println("M1 is Executed");
	System.out.println(a);
	}
public void m2() {
	System.out.println("M2 is Executed");
	System.out.println(b);
	}
public void m3() {
	System.out.println("M3 is Executed");
	System.out.println(b);
}
public static void main(String args[]) {
	System.out.println("main method executed");
	Dt_Var1 m = new Dt_Var1();
	m.m1();
	m.m2();
	m.m3();
}
}


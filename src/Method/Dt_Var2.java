package Method;

public class Dt_Var2 {
	int b = 30;
	static int empid = 101;
	public void m1() {
		int a = 10;
		System.out.println("M1 is Executed");
		System.out.println(a+"is loca;l variable");
		System.out.println(empid+"static variable");
		}
	public void m2() {
		System.out.println("M2 is Executed");
		System.out.println(b+"insatnce variable");
		System.out.println(empid+"static variable");
		}
	public void m3() {
		System.out.println("M3 is Executed");
		System.out.println(b+"instance variable");
	}
	public static void main(String args[]) {
		System.out.println("main method executed");
		Dt_Var2 m = new Dt_Var2();
		m.m1();
		m.m2();
		m.m3();
	}

}

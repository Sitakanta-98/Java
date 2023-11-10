package Method;

public class Dt_Var3 {
	int b = 30;
	static int empid = 101;
	public void m1() {
		int a = 10;
		System.out.println("M1 is Executed");
		System.out.println(a+"local var");
		System.out.println(empid+"static var");
		}
	public void m2() {
		System.out.println("M2 is Executed");
		System.out.println(b+"instance var");
		System.out.println(empid+"static var");
		}
	public void m3() {
		System.out.println("M3 is Executed");
		System.out.println(empid+"static var");
		}
	public static void st() {
		System.out.println("static method executed");
	}
	  public static void main(String args[]) {
		System.out.println("main method executed");
		Dt_Var3 m = new Dt_Var3();
		m.m1();
		m.m2();
		m.m3();
		Dt_Var3.st();
	  }
}

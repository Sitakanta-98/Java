package Method;

public class Dt_Var {
	public void m1() {
		int a = 10; 
		System.out.println("M1 executed");
		System.out.println(a);
	}
	public void m2() {
		System.out.println("M2 executed");
	}
	public void m3() {
		System.out.println("M3 executed");
    }
	public static void main(String args[]) {
		System.out.println("main method executed");
		Dt_Var m = new Dt_Var();
		m.m1();
		m.m2();
		m.m3();
	}

}

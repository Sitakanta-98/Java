package Polymerphism;

public class OverRide1 extends OverRide{
	 public void add(int a,int b) {
		 System.out.println(a-b);
		 System.out.println("New Fea:");
	 }
	 public static void main(String args[]) {
		 OverRide1 obj= new OverRide1();
		 obj.add(10,20);
		 }
 }



package Condition;

public class Nested_If1 {
public static void main(String args[]) {
	int a = 40;
	int b = 50;
	if(a==30) {
		if(b==40) {
			System.out.println("a value is 30 & b value is 40");
		}
		else {
			System.out.println("else stmt of second cond");
		}
	}
	else {
		System.out.println("else stmt of first cond");
	}
}
}

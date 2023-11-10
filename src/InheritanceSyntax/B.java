package InheritanceSyntax;

class Car{
	public void colour() {
	//stmt;
	}
    public void wheels() {
    //stmt;
    }
}
class A extends Car {
public void abc(){
	//stmt;
	colour();//stmt;
	wheels();//stmt;	
}
}
public class B extends A{
	{
	abc();//stmt;
	colour();//stmt;
	wheels();//stmt;
	}
public static void main(String args[]) {
	B obj = new B();
	obj.colour();
	obj.wheels();
	obj.abc();
}
}

package basic.corejava;

public class Method {

	private static void myMethod() {//Method header
		System.out.println("My Method without Arguements....");//method body or method signature
	}

	private static void myMethod(int i) {
		System.out.println("My method with arguements....");
	}

	public static void main(String[] args) {
		myMethod();
		myMethod(5);
	}

}

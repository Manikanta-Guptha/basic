package basic.corejava;

class One {
	public void method() {
		System.out.println("Without Args...");

	}

	public void method(int i) {
		System.out.println("With Args...");
	}
}

class Two extends One {
	public void method(int i) {
		System.out.println("Override...");
	}
}

public class Polymor {

	public static void main(String[] args) {
		Two obj = new Two();
		obj.method(5);
	}
}

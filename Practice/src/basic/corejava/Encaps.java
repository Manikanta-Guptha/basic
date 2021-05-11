package basic.corejava;

class A {
	private int i;

	public void setI(int j) {
		i = j;
	}

	public int getI() {
		return i;
	}
}

public class Encaps {
	public static void main(String[] args) {
		A a = new A();
		a.setI(5);
		System.out.println(a.getI());
	}

}

package basic.corejava;

class Add {

	public int add(int i, int j) {
		return i + j;
	}
}

class Sub extends Add {
	public int sub(int i, int j) {
		return i - j;
	}
}

public class Inherit {

	public static void main(String[] args) {

		Sub obj = new Sub();//create object for sub class

		System.out.println(obj.add(5, 4));
		System.out.println(obj.sub(5, 4));

	}
}

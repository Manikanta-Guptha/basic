package basic.corejava;

class Cons {

	int i;
	int j;

	public Cons() {

		i = 5;
		j = 3;
		System.out.println(i + " " + j);
	}

}

public class Constructor {

	public static void main(String[] args) {
		Cons cons = new Cons();

		//new Cons(); -- We can use like this also
	}
}

package basic.corejava;

abstract class Phone {

	public void ring() {
		System.out.println("Phone rings...");
	}

	public abstract void battery();

}

abstract class Laptop extends Phone {

	@Override
	public void battery() {
		System.out.println("Battery Charges...");
	}

	public abstract void call();
}

class Watch extends Laptop {// Concrete Class

	@Override
	public void call() {
		System.out.println("Call...");

	}

}

public class Abstraction {

	public static void main(String[] args) {
		Watch watch = new Watch();// We can instantiate the concrete class but not abstract class
		watch.battery();
		watch.call();
		watch.ring();

	}

}

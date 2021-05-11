package basic.corejava;

class Animal {

	public void eat() {
		System.out.println("Animal Eats..");
	}

	public void sleep() {
		System.out.println("Animal Sleeps..");
	}
}

class Mammal extends Animal {

	public void controlTemp() {
		System.out.println("Mammal ControlsTemp..");
	}
}

class Lion extends Mammal {
	public void sleep() {
		System.out.println("Lion Sleeps...");
	}

	public void roar() {
		System.out.println("Lion Roars..");
	}
}

public class ObjectCasting {

	public static void main(String[] args) {
		
		Animal ani = new Lion();
		ani.sleep();//override
		ani.eat();
		Lion lion = (Lion)ani; //Downcasting
		lion.roar();
		Mammal mammal = new Mammal();
		mammal.controlTemp();
		mammal.eat();
		mammal.sleep();
		Animal animal= (Animal)mammal;  //UpCasting
		Animal animal1=new Animal();
		animal1.eat();
		animal1.sleep();
		
	}

}

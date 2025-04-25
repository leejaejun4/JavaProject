package chapter09;

public class AnimalMain {

	public static void main(String[] args) {

		Dog d = new Dog();
		Cat c = new Cat();

		animalSound(d);
		animalSound(c);

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

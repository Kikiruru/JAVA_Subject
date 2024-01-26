package Week10;

abstract class Animal {
	protected String species;

	public void breathe() {
		System.out.println("숨을 쉽니다");
	}

	public abstract void bark();
}

class Dog extends Animal {
	public Dog() {
		species = "Dog";
	}

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public Cat() {
		species = "Cat";
	}

	@Override
	public void bark() {
		System.out.println("야옹");
	}
}

class Bird extends Animal {
	public Bird() {
		species = "Bird";
	}

	@Override
	public void bark() {
		System.out.println("짹짹");
	}
}

public class week_9 {
	public static void main(String[] args) {
		Animal a1 = new Bird();
		Animal a2 = new Dog();

		a1.bark();
		a2.bark();
	}
}

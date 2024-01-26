package Week05;

public class Answer1 {
	public static void play(Animal ani) {
		ani.run();
		ani.sound();
	}
	
	public static void main(String[] args) {
		Animal animal = new Baby("신생아");
		play(animal);
		animal = new Dog("강아지");
		play(animal);
	}
}

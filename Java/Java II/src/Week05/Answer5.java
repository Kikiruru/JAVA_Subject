package Week05;

public class Answer5 {
	public static void main(String[] args) {
		Animal_2[] pets = {
				new Cat_2("Nabee"),
				new Dog_2(),
				new Cat_2(),
				new Dog_2(),
				new Dog_2("Rock")
		};
		
		for(Animal_2 ani : pets) {
			System.out.print("\n"+ ani +"_"+ ani.reaction(ani));
			ani.sound();
		}
		System.out.print("\n\nPet들 중 Dog는 "+ Dog_2.getCountDog() +"마리\n");
	}
}

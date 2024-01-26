package Week05;

public class Answer4 {
	public static void main(String[] args) {
		Fruit[] fary = new Fruit[4];
		fary[0] = new Fruit();
		fary[1] = new Apple();
		fary[2] = new Grape();
		fary[3] = new Pear();
		
		for(Fruit obj : fary) {
			obj.me();
		}
	}
}

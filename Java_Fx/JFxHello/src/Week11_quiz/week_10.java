package Week11_quiz;

class Banana implements Food {
	public void info() {
		System.out.println("type : 과일");
	}
}

class Pork implements Food {
	public void info() {
		System.out.println("type : 고기");
	}
	public void alert() {
		System.out.println("------고기는 조리하여 드세요------");
	}
}

class Carrot implements Food {
	public void info() {
		System.out.println("type : 채소");
	}
}

class Ingredient {
	public void foodType(Food f) { // 1
		if(f instanceof Pork) { // 2
			Pork pork = (Pork) f;
			pork.alert();
		}
		f.info();
	}
}

public class week_10 {
	public static void main(String[] args) {
		Ingredient ing = new Ingredient();
		
		Banana b = new Banana();
		Pork p = new Pork();
		Carrot c = new Carrot();
		
		ing.foodType(b);
		System.out.println();
		ing.foodType(p);
		System.out.println();
		ing.foodType(c);
	}
}

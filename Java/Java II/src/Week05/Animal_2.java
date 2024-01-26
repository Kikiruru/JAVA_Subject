package Week05;

abstract class Animal_2 {
	String name;
	
	public Animal_2(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String reaction(Animal_2 ani) {
		if(ani instanceof Dog_2) {
			return "꼬리올리고";
		}
		else if(ani instanceof Cat_2) {
			return "꼬리내리고";
		}
		return "None";
	}
	
	abstract void sound();
}

class Dog_2 extends Animal_2{
	private static int CountDog = 0;
	
	public Dog_2() {
		super("Anonymous");
		CountDog++;
	}
	
	public Dog_2(String name) {
		super(name);
		CountDog++;
	}
	
	public void sound() {
		System.out.print(" 멍멍 ");
	}

	public static int getCountDog() {
		return CountDog;
	}

	public static void setCountDog(int countDog) {
		CountDog = countDog;
	}
	
	public String toString() {
		return super.name +"강아지";
	}
}

class Cat_2 extends Animal_2{
	private static int CountCat = 0;
	
	public Cat_2() {
		super("Anonymous");
		CountCat++;
	}
	
	public Cat_2(String name) {
		super(name);
		CountCat++;
	}
	
	public void sound() {
		System.out.print(" 야~옹 ");
	}

	public static int getCountCat() {
		return CountCat;
	}

	public static void setCountCat(int countCat) {
		CountCat = countCat;
	}
	
	public String toString() {
		return super.name +"고양이";
	}
}
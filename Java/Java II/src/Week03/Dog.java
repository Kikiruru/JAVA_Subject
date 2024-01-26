package Week03;

class Dog {
	private int age, food;
	private String color;
	private static int total = 0;
	
	public Dog() { this(0, "NULL", 0); total++; }
	public Dog(int age, String color, int food) {
		this.age = age;
		this.color = color;
		this.food = food;
		total++;
	}
	
	public String barking() {
		if(food > 0)
		{
			food--;
			return "멍멍";
		}
		else
			return "시무룩";
	}
	
	public boolean hungry() {
		if(food <= 1)
			return true;
		else
			return false;
	}
	
	public boolean sleeping(int food) {
		if(food > 0) {
			this.food += food;
			return false;
		}
		else
			return true;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getFood() {
		return food;
	}
	
	@Override
	public String toString() {
		return "Dog[age="+ age +", color="+ color +", food="+ food+"]";
	}
	
	public static int getTotal() {
		return total;
	}
}

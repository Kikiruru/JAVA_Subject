package Week05;

public class Fruit {
	public void me() {
		System.out.println("나는 과일");
	}
}

class Apple extends Fruit{
	public void me() {
		System.out.println("나는 사과");
	}
}

class Grape extends Fruit{
	public void me() {
		System.out.println("나는 포도");
	}
}

class Pear extends Fruit{
	public void me() {
		System.out.println("나는 배");
	}
}
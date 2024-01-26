package Week03;

public class week03_app02 {
	public static void main(String[] agrs) {
		Dog[] d = new Dog[5];
		String color;
		
		d[0] = new Dog(1, "RED", 2);
		d[1] = new Dog(1, "BLUE", 2);
		d[2] = new Dog(2, "BLACK", 3);
		d[3] = new Dog(2, "GRAY", 1);
		d[4] = new Dog(3, "PINK", 0);
		
		System.out.println("현재 생성된 객체 수 = "+ Dog.getTotal());
		System.out.println("현재 생성된 객체 정보");
		for(Dog dog : d) {
			System.out.println(dog.toString());
		}
		
		System.out.println("\nbarking_test");
		for(Dog dog : d) {
			System.out.println(dog.barking());
		}
		
		System.out.println("\nhungry_test");
		for(Dog dog : d) {
			System.out.println(dog.hungry());
		}
		
		System.out.println("\nsleeping_test");
		System.out.println(d[1].toString());
		System.out.print("sleeping(4)="+ d[1].sleeping(4) +"\t");
		System.out.println(d[1].toString());
		System.out.print("sleeping(0)="+ d[1].sleeping(0) +"\t");
		System.out.println(d[1].toString());
		
		System.out.println("\nDog 찾기");
		color = "BLUE";
		for(int i = 0; i < Dog.getTotal(); i++) {
			if(d[i].getColor().equals(color)) {
				System.out.println(i+1 +"번째 위치 "+ color +" Dog food:"+ d[i].getFood());
			}
		}
	}
}

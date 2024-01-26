package Week10;

class Parent2 {
}

class Child2 extends Parent2 {
}

public class InstanceofExample {
	
	public static void method1(Parent2 parent) {
		if (parent instanceof Child2) { //빈칸 
			//Child2 child = (Child2) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	public static void method2(Parent2 parent) {
		//Child2 child = (Child2) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent2 parentA = new Child2();
		method1(parentA);
		method2(parentA);
		
		Parent2 parentB = new Parent2();
		method1(parentB);
		method2(parentB);
	}
	
}

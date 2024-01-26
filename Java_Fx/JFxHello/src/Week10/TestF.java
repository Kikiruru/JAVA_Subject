package Week10;

class Parent {
	public String field1;

	public void method1() {
		System.out.println("Parent2-method1()");
	}

	public void method2() {
		System.out.println("Parent2-method2()");
	}
}

class Child extends Parent {
	public String field2;

	public void method3() {
		System.out.println("Child2-method3()");
	}
}

public class TestF {
	public static void main(String[] args) {
		
		Parent parent = new Child();	 //ㄱ- 자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.field2 = "data2"; 	 //ㄴ - 자식 클래스의 필드이도 사용가능
		//parent.method3(); 			 //ㄷ - 자식 클래스의 메소드도 사용가능
		
		Child child = (Child) parent; //ㄹ - 강제 타입 변환
		child.field2 = "yyy"; 		 //ㅁ - 자식 클래스의 필드도 사용가능
		child.method3(); 			 //ㅂ - 자식 클래스의 메소드도 사용가능
		child.method1(); 			 //ㅅ - 부모 클래스의 메소드이므로 사용블가(불가능)
		child.method2(); 			 //ㅇ - 부모 클래스의 메소드도 사용가능
		 
	}

}

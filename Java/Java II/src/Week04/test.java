package Week04;

class Bike {
	public int gear;
	protected int speed;
}

class A { 
	/*
	public A() { System.out.println("1"); }
	public A(int x) { System.out.println("2"); }
	*/
	
	public void methodOne(int i) { }
	public void methodTwo(int i) { System.out.println("A2"); }
	//public static void methodThree(int i) { }
	public static void methodFour(int i) { System.out.println("A4"); }
} 

class B extends A{
	/*
	B (){
		System.out.println("3");
	}
	*/
	
	public void methodOne(int i) { }
	public void methodTwo(int i) { System.out.println("B2"); }
	public void methodThree(int i) { }
	public static void methodFour(int i) { System.out.println("B4"); }
}

class MountainBike extends Bike {
	public int seatHeight;

	public MountainBike(int g) {
		super();
		gear=g;
	}
}

class ClassA {
	int val=3;
	public void f(ClassA a) { System.out.print("Af(a)"); }
	public void f(ClassB b) { System.out.print("Af(b)"); }
}
class ClassB extends ClassA {
	int val=5;
	public void f(ClassA a) { System.out.print("Bf(a)"); }
	public void f(ClassB b) { System.out.print("Bf(b)"); }
}


public class test {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassA ab = new ClassB();
		
		System.out.println("a.val = " + a.val);
		System.out.println("b.val = " + b.val);
		System.out.println("ab.val = " + ab.val);

		System.out.print("\n a.f(a)="); a.f(a);
		System.out.print("\n a.f(b)="); a.f(b);

		System.out.print("\n b.f(a)="); b.f(a);
		System.out.print("\n b.f(b)="); b.f(b); 

		System.out.print("\n a.f(ab)="); a.f(ab); 
		System.out.print("\n b.f(ab)="); b.f(ab);

		System.out.print("\n ab.f(a)="); ab.f(a); 
		System.out.print("\n ab.f(b)="); ab.f(b);
		System.out.print("\n ab.f(ab)="); ab.f(ab);	
		/*
		A aa = new A();
		B bb = new B();
		A ab = new B();
		B.methodFour(0);
		A.methodFour(0);
		aa.methodTwo(0);
		bb.methodTwo(0);
		ab.methodTwo(0);
		/
		/*
		MountainBike mb = new MountainBike(10);
		B b = new B();
		System.out.println("실행 완료");
		*/
		/*
		System.out.println("g="+ mb.gear);
		System.out.println("speed="+ mb.speed);
		*/
	}
}

package Week11_RemoteControl2;

interface InterfaceA {
	public void methodA();
}

interface InterfaceB {
	public void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB { //ㄱ. 다중상속이다.
	public void methodC();
}

class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;

		ia.methodA(); // ㄴ. InterfaceA 변수는 methodA()만 호출가능
		System.out.println();

		InterfaceB ib = impl;

		ib.methodB(); // ㄷ. InterfaceB 변수는 methodB()만 호출가능
		System.out.println();

		InterfaceC ic = impl;

		ic.methodA(); // ㄹ. InterfaceC 변수는 methodC()만 호출가능
		ic.methodB();
		ic.methodC();
	}
}

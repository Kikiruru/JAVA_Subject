package Week13_1;

class C {
	int val=3;
	public void f(C a) { System.out.print("Af(a)"); }
	public void f(D b) { System.out.print("Af(b)"); }
}
class D extends C {
	int val=5;
	public void f(C a) { System.out.print("Bf(a)"); }
	public void f(D b) { System.out.print("Bf(b)"); }
}
public class Test3 {
	public static void main(String[] args) {
		C a = new C();
		D b = new D();
		C ab = new D();
		
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
	}
}


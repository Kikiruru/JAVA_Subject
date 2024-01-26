package Week13_1;

class A { 
	public A() { System.out.println("1"); }
	public A(int x) { System.out.println("2"); } 
} 
class B extends A { 
} 
public class Test2 { 
    public static void main (String args []) {
        B b = new B(); 
        System.out.println("실행 완료"); 
    } 
}
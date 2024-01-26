package Week13_1;

class ClassE {
	public void methodOne(int i) { }
	public void methodTwo(int i) { System.out.println("A2"); }
	public void methodThree(int i) { }
	public static void methodFour(int i) { System.out.println("A4"); }
}
class ClassF extends ClassE {
	public void methodOne(int i) { }
	public void methodTwo(int i) { System.out.println("B2"); }
	public void methodThree(int i) { }
	public static void methodFour(int i) { System.out.println("B4"); }
}
public class Test4 {
	public static void main(String args[]) {
		ClassE aa = new ClassE();
		ClassF bb = new ClassF();
		ClassE ab = new ClassF();
		ClassF.methodFour(0);
		ClassE.methodFour(0);
		aa.methodTwo(0);
		bb.methodTwo(0);
		ab.methodTwo(0);
	}
}

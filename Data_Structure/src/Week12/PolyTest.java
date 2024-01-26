package Week12;

public class PolyTest {
	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		
		System.out.println("--------------------");
		System.out.println("Is p1 zero? : "+ p1.ispZero());
		System.out.print("p1.addTerm(1, 2) : ");
		p1.addTerm(1, 2);
		p1.print();
		System.out.print("p1.addTerm(2, 2) : ");
		p1.addTerm(2, 2);
		p1.print();
		System.out.print("p1.addTerm(2, 4) : ");
		p1.addTerm(2, 4);
		p1.print();
		System.out.print("p1.addTerm(5, 3) : ");
		p1.addTerm(5, 3);
		p1.print();
		System.out.print("p1.addTerm(5, 1) : ");
		p1.addTerm(5, 1);
		p1.print();
		System.out.println("Is p1 zero? : "+ p1.ispZero());
		System.out.println("--------------------");
		System.out.print("p1.delTerm(4) : ");
		p1.delTerm(4);
		p1.print();
		System.out.print("p1.delTerm(2) : ");
		p1.delTerm(2);
		p1.print();
		System.out.print("p1.delTerm(1) : ");
		p1.delTerm(1);
		p1.print();
		System.out.print("p1.delTerm(3) : ");
		p1.delTerm(3);
		p1.print();
		System.out.println("Is p1 zero? : "+ p1.ispZero());
		System.out.println("--------------------");
		p1.addTerm(4, 4);
		p1.addTerm(2, 2);
		p1.addTerm(1, 0);
		p1.print();
		System.out.print("p1.sMult(2, 2) : ");
		p1 = p1.sMult(2, 2);
		p1.print();
		System.out.print("p1.sMult(4, 7) : ");
		p1 = p1.sMult(4, 7);
		p1.print();
		System.out.print("p1.sMult(0, 3) : ");
		p1 = p1.sMult(0, 3);
		p1.print();
		System.out.println("--------------------");
		p1.addTerm(3, 2);
		p1.addTerm(5, 1);
		p1.addTerm(2, 0);
		System.out.print("p1 = ");
		p1.print();
		p2.addTerm(5, 1);
		p2.addTerm(3, 2);
		System.out.print("p2 = ");
		p2.print();
		System.out.print("p1 x p2 = ");
		p1.polyMult(p2).print();
		System.out.print("p1 + p2 = ");
		p1.polyAdd(p2).print();
	}
}

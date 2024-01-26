package Week07;

public class PolynomialTest {
	public static void main(String[] args) {
		Polynomial A = new Polynomial();
		Polynomial B = new Polynomial();
		
		A.addTerm(10, 0);
		A.addTerm(5, 3);
		A.addTerm(7, 5);
		A.addTerm(9, 7);
		A.print();
		
		B.addTerm(6, 1);
		B.addTerm(8, 4);
		B.addTerm(7, 5);
		B.addTerm(3, 8);
		B.print();
		
		A.delTerm(7);
		A.print();
		
		B.delTerm(8);
		B.print();
		
		A.Add(4, 2);
		A.Add(3, 5);
		A.print();
		
		A = A.sMult(3, 2); // 3x^2를 곱해줌
		A.print();
		A = A.sMult(2, 1); // 2x를 곱해줌
		A.print();
		
		System.out.print("B :");
		B.print();
		A = A.polyAdd(B);
		A.print();
		
		for(int i = 0; i < 10; i++) {
			A.delTerm(i);
			B.delTerm(i);
		}
		
		A.addTerm(2, 1);
		A.addTerm(1, 0);
		
		B.addTerm(1, 1);
		B.addTerm(2, 0);
		
		A.print();
		B.print();
		
		A = A.polyMult(B);
		A.print();
	}
}

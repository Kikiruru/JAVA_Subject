package Week07;

public class Polynomial {
	private int[] cofficient; //계수
	private int degree;
	
	public Polynomial() {
		cofficient = new int[100];
		degree = -1;
	}
	
	public boolean isZeroP() {
		if (degree < 0) return true;
		return false;
	}
	
	public int coef(int e) {
		return cofficient[e];
	}
	
	public int maxExp() {
		return degree;
	}
	
	public void addTerm(int c, int e) {
		cofficient[e] = c;
		if(degree < e)
			degree = e;
	}
	
	public void delTerm(int e) {
		cofficient[e] = 0;
		if(e == degree) {
			for(int i = e-1; i > 0; i--) {
				if(cofficient[i] != 0) {
					degree = i;
					break;
				}
			}
			if(e == degree) degree = 0; //차수가 높은데에서 낮은대로 검사
			//따라서 더이상 내려갈 항이 없으면 degree = 0
			/*
			int i = e-1;
			while(i > -1 && cofficient[i] == 0)
				i--;
			degree = i;
			 */
		}
	}
	public void Add(int c, int e) {
		cofficient[e] += c;
	}
	
	public Polynomial sMult(int c, int e) {
		Polynomial p = new Polynomial();
		for(int i = 0; i <= degree; i++) {
			if(cofficient[i] != 0) {
				p.cofficient[i+e] = cofficient[i] * c;
				p.degree = degree + e;
			}
		}
		return p;
	}
	
	public Polynomial polyAdd(Polynomial q) {
		Polynomial p = new Polynomial();
		//int degree;
		if(q.degree < degree)
			p.degree = degree;
		else
			p.degree = q.degree;
		
		for(int i = 0; i <= p.degree; i++)
			p.cofficient[i] = cofficient[i] + q.cofficient[i];
		return p;
	}
	
	public Polynomial polyMult(Polynomial q) {
		Polynomial p = new Polynomial();
		
		for(int i = 0; i <= q.degree; i++) {
			if(q.cofficient[i] != 0) {
				Polynomial temp = this.sMult(q.cofficient[i], i);
				p = p.polyAdd(temp);
			}
		}
		return p;
	}
	
	public void print() {
		System.out.println("Degree"+ degree);
		System.out.print("함수 : ");
		for(int i = degree; i >= 0; i--) {
			if(cofficient[i] != 0) {
				System.out.print(cofficient[i]);
				System.out.print("x^"+ i +' ');
				}
		}
		System.out.println();
	}
}

class Term { //coef와 exp를 같이 가지고 있는 객체 가장 큰수가 0번지 가장 작은 수가 numOfTerm번지
	//Term의 배열로 coef와 exp를 같이 표현
	private int coef;
	private int exp;
	
	public Term(int c, int e) {
		coef = c;
		exp = e;
	}
	
	public int getCoef() {
		return coef;
	}
	
	public int getExp() {
		return exp;
	}
}

class Polynomial2 {
	int MAX = 10;
	private Term[] terms;
	private int numOfTerms;
	
	public Polynomial2() {
		terms = new Term[MAX];
		numOfTerms = 0;
	}
	
	public int coef(int e) { //지수가 e인곳의 주소
		for(int i = 0; i < numOfTerms; i++) {
			if(terms[i].getExp() == e)
				return terms[i].getCoef();
		}
		return 0; //없으면 0반환
	}
	private int findNextIndex(int e) {
		int i;
		for(i = 0; i < numOfTerms; i++) {
			if(terms[i].getExp() == e) return -1;
			if(terms[i].getExp() < e) return i;
		}
		return numOfTerms;
	}
	public boolean addTerm(int c, int e) {
		if(coef(e) != 0) return false;
		Term nt = new Term(c, e);
		int index = findNextIndex(e);
		for(int i = numOfTerms; i > index; i--) {
			terms[i] = terms[i-1];
		}
		terms[index] = nt;
		numOfTerms++;
		return true;
	}
	
	public Polynomial2 sMult(int c, int e) {
		Polynomial2 p = new Polynomial2();
		int exp, coef;
		for(int i = 0; i < numOfTerms; i++) {
			exp = terms[i].getExp() + e;
			coef = terms[i].getCoef() * c;
			p.terms[i] = new Term(coef, exp);
		}
		p.numOfTerms = numOfTerms;
		return p;
	}
	
	public Polynomial2 polyAdd(Polynomial2 p) {
		Polynomial2 r = new Polynomial2();
		int tp = 0; int pp = 0;
		while(tp < this.numOfTerms && pp < p.numOfTerms) {
			if(this.terms[tp].getExp() == p.terms[pp].getExp()) {
				r.addTerm(this.terms[tp].getCoef() + p.terms[pp].getCoef(),
						p.terms[pp].getExp());
				tp++; pp++;
			} else if (this.terms[tp].getExp() < p.terms[pp].getExp()) {
				r.addTerm(p.terms[pp].getCoef(), p.terms[pp].getExp());
				pp++;
			} else {
				r.addTerm(this.terms[tp].getCoef(), this.terms[tp].getExp());
				tp++;
				}
		}
		while(tp < this.numOfTerms) {
			r.addTerm(this.terms[tp].getCoef(), this.terms[tp].getExp());
			tp++;
		}
		while(pp < p.numOfTerms) {
			r.addTerm(p.terms[pp].getCoef(), p.terms[pp].getExp());
			pp++;
		}
		return r;
	}
	
	public Polynomial2 polyMult(Polynomial2 p) {
		Polynomial2 r = new Polynomial2();
		for(int i = 0; i < p.numOfTerms; i++) {
			Polynomial2 t = sMult(p.terms[i].getCoef(), p.terms[i].getExp());
			r = r.polyAdd(t);
		}
		return r;
	}
}
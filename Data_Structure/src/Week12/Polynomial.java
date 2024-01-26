package Week12;

public class Polynomial {
	private PolyNode firstNode;
	private PolyNode lastNode;
	
	public Polynomial()
	{
		firstNode = null;
		lastNode = null;
	}
	
	public boolean ispZero() { // 빈객체면 true 반환
		if(firstNode == null)
			return true;
		else
			return false;
	}
	
	public int coef(int e) {
		PolyNode newNode = firstNode;
		while(newNode.exp != e) {
			newNode = newNode.link;
		}
		return newNode.coef;
	}
	
	public int maxExp() {
		return firstNode.exp;
	}
	
	public void addTerm(int c, int e) {
		PolyNode newNode = new PolyNode();
		PolyNode p = firstNode;
		PolyNode q = firstNode;
		newNode.coef = c;
		newNode.exp = e;
		newNode.link = null;
		
		if(c == 0)
			return;
		if(firstNode == null)
			firstNode = lastNode = newNode;
		else {
			while(p != null) {
				if(p.exp == e) {
					p.coef += c;
					return;
				}
				else if (p.exp < e) {
					if(p == firstNode) {
						newNode.link = p;
						firstNode = newNode;
					}
					else {
						newNode.link = p;
						q.link = newNode;
					}
					return;
				}
				q = p;
				p = p.link;
			}
			// while문 벗어남 마지막 노드에 추가
			q.link = newNode;
			lastNode = newNode;
		}
	}
	
	public void delTerm(int e) {
		PolyNode p = firstNode;
		PolyNode q = firstNode;
		
		if (firstNode == null) return;
		
		while(p != null) {
			if(firstNode.exp == e) {
				if(firstNode == lastNode) {
					firstNode = lastNode = null;
					return;
				}
				else {
					firstNode = firstNode.link;
					return;
				}
			}
			else if(p.exp == e) {
				q.link = p.link;
				p.link = null;
				return;
			}
			q = p;
			p = p.link;
		}
		if (lastNode.exp == e) {
			lastNode = q;
			q.link = null;
			return;
		}
		return;
	}
	
	public Polynomial sMult(int c, int e) {
		Polynomial re = new Polynomial();
		PolyNode p = firstNode;
		if(c == 0) {
			return re;
		}
		while(p != null) {
			int coef = p.coef * c;
			int exp = p.exp + e;
			re.appendTerm(coef, exp);
			p = p.link;
		}
		return re;
	}
	
	public Polynomial polyMult(Polynomial poly) {
		Polynomial re = new Polynomial();
		Polynomial temp = new Polynomial();
		PolyNode q = poly.firstNode;
		while(q != null) {
			temp = this.sMult(q.coef, q.exp);
			re = re.polyAdd(temp);
			q = q.link;
		}
		return re;
	}
	
	public void print() {
		if(firstNode == null) {
			System.out.println(0);
			return;
		}
		PolyNode newNode = firstNode.link;
		System.out.print(firstNode.coef +"X^"+ firstNode.exp);
		while(newNode != null) {
			if(newNode.coef > 0)
				System.out.print("+" +newNode.coef +"X^"+ newNode.exp);
			else
				System.out.print("-"+ newNode.coef +"X^"+ newNode.exp);
			newNode = newNode.link;
		}
		System.out.println();
	}
	
	private void appendTerm(int c, int e) { //클래스 내에서만 이용
		PolyNode newNode = new PolyNode();
		newNode.coef = c;
		newNode.exp = e;
		newNode.link = null;
		
		//일반적인 경우
		if(firstNode == null) {
			firstNode = lastNode = newNode;
		}
		else {
			lastNode.link = newNode;
			lastNode = newNode;
		}
	}
	
	public Polynomial polyAdd(Polynomial poly) {
		Polynomial re = new Polynomial();
		PolyNode p = firstNode;
		PolyNode q = poly.firstNode;
		
		while(p != null && q != null) {
			if(p.exp == q.exp) {
				re.appendTerm(p.coef + q.coef, p.exp);
				p = p.link;
				q = q.link;
				continue;
			}
			else if(p.exp > q.exp) {
				re.appendTerm(p.coef, p.exp);
				p = p.link;
				continue;
			}
			else if(p.exp < q.exp) {
				re.appendTerm(q.coef, q.exp);
				q = q.link;
				continue;
			}
		}
		//남은 항 모두 뒤에 차례대로 추가
		while(p != null) { //p가 남았을 경우
			re.appendTerm(p.coef, p.exp);
			p = p.link;
		}
		while(q != null) { //q가 남았을 경우
			re.appendTerm(q.coef, q.exp);
			q = q.link;
		}
		return re;
	}
}

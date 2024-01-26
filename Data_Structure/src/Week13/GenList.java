package Week13;

public class GenList {
	private ListNode head;
	
	void insertData(Object x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = head;
		//head == null -> newNode.link = null
		head = newNode;
	}
	
	void printGL() {
		ListNode newNode = head;
		if(head == null) {
			System.out.println("NULL_List");
			return;
		}
		System.out.print("(");
		while(newNode != null) {
			if(newNode.data instanceof GenList) {
				((GenList)newNode.data).printGL();
				//newNode.data가 GenList타입이면 ListNode newNode를
				//GenList타입으로 바꾼 후 순차적으로 출력
			} else {
				System.out.print(newNode.data);
			}
			newNode = newNode.link;
			if(newNode != null)
				System.out.print(",");
		}
		System.out.println(")");
		return;
	}
	/*
	void printGL2() {
		System.out.print("(");
		ListNode p = head;
		while(p != null) {
			if(p.data instanceof GenList) {
				// data값이 GenList 참조값인가를 검사
				((GenList)p.data).printGL();
				// 서브리스트를 순차적으로 프린트
			} else {
				System.out.print(p.data);
			}
			if ((p = p.link) != null) {
				System.out.print(",");
			}
		}
		System.out.print(")");
	}
	*/
	public GenList copy() {
		//복사하고자 하는 GenList의 서브리스트를 공유하지 않을 경우에만 가능
		GenList gl = new GenList();
		gl.head = theCopy(head);
		return gl;
	}
	
	private ListNode theCopy(ListNode h) {
		ListNode p = null;
		Object q;
		ListNode r;
		if (h != null) {
			if(!(h.data instanceof GenList))
				// h.data가 GenList 참조값이 아니면
				q = h.data;
			else // h.data가 GenList 참조값이면
				q = ((GenList)h.data).copy(); //순환호출
			r = theCopy(h.link); //순환호출
			p = new ListNode();
			p.data = q;
			p.link = r;
		}
		return p;
	}
	
	public boolean equal(GenList T) {
		return theEqual(this.head, T.head);
	}
	
	private boolean theEqual(ListNode s, ListNode t) {
		if (s == null && t == null) return true;
		if (s == null && t != null) return false;
		if (s != null && t == null) return false;
		
		//if(s != null && t != null)
		if(s.data instanceof GenList && t.data instanceof GenList) {
			if(((GenList)s.data).equal((GenList)t.data))
				return theEqual(s.link, t.link); //순환호출
			else return false;
		}else if (!(s.data instanceof GenList) && !(t.data instanceof GenList)) {
			if(s.data.equals(t.data))
				return theEqual(s.link, t.link);
			else return false;
		}else return false;
		//한쪽은 GenList참조고 다른 한쪽이 아니면 false 
	}
}

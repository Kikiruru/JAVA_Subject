package Week09;

class Node {
	String data;
	Node link;
	
	public Node() {
		data = null;
		link = null;
	}
	public Node(String data) {
		this.data = data;
		this.link = null;
	}
}

class LinkedList {
	Node head;
	int length;
	
	public LinkedList() {
		head = null;
		length = 0;
	}
	
	public int size() {
		return length;
	}
	
	public void addFirst(String x) {
		Node newNode = new Node();
		newNode.data = x;
		newNode.link = head;
		head = newNode;
		length++;
	}
	
	public void addLast(String x) {
		Node newNode = new Node();
		Node p;
		newNode.data = x;
		newNode.link = null;
							
		if(head == null) {
			head = new Node();
			p = head;
		}
		else {
			p = head;
			while(p.link != null)
				p = p.link;
		}
		p.link = newNode;
		length++;
	}
	
	public void delete(Node p) {
		if(head == null) return;
		else if(p == null) {
			head = head.link;
		}
		else
			p.link = p.link.link;
		length--;
	}
	/*
	public void deleteLast(){
		if(head == null)
			return;
		if(head.link == null)
			head = head.link // head = null;
		else {
			//p가 마지막 노드의 이전 노드를 가리킨다
			p = head;
			c = head.link;
			while(c != null){
				p = c;
				c = c.link;
			}
			p.link = null;
		}
	}
	*/
	public void insert(Node p, String x) {
		Node newNode = new Node();
		newNode.data = x;
		if(head == null) {
			newNode.link = null; head = newNode; //원본 head = new Node()
		}
		else if(p == null) {
			newNode.link = head;
			head = newNode;
			length++;
			//addFirst(x);
		}
		else {
			newNode.link = p.link;
			p.link = newNode;
			length++;
		}
	}
	/*
	public void reverse() {
		p = head;
		q = null;
		r = null;
		while(p != null) {
			r = q;
			q = p;
			p = p.link;
			q.link = r;
		}
		head = q;
	}
	*/
	//public LinkedList ConcatList(LinkedList l2) { //addList(l1, l2)
		
		/* if(this.head == null) return l2;
		else if(l2.head == null) return this;
		Node p = head;
		while(p.link != null) p = p.link;
		*/
		
		/* 일반적인 경우
		p가 this의 마지막 노드를 가르키게 만든 후
		p.link = l2.head;
		return this;
		*/
	//}
	
	/*
	public Node searchNode(String x) {
		p = head;
		while(p != null){
			if(p.data.equals(x))
				return p;
			p = p.link;
		}
		return null;
	}
	*/
	public void printList() {
		Node p;
		System.out.print("(");
		p = head;
		while (p != null) {
			System.out.print(p.data);
			p = p.link;
			if(p != null) {
				System.out.print(",");
			}
		}
		System.out.print(")");
	}
}

public class Node_Test {
	public static void main(String[] args) {
		Node h = new Node();
		h.data = "cho";
		h.link = null;
		h.link = new Node();
		h.link.data = "kim";
		h.link.link = null;
		h.link.link = new Node();
		h.link.link.data = "Lee";
		h.link.link.link = null;
		h.link.link.link = new Node();
		h.link.link.link.data = "Park";
		h.link.link.link.link = null;
		h.link.link.link.link = new Node();
		h.link.link.link.link.data = "Yoo";
		h.link.link.link.link.link = null;
		
		Node nNode = new Node();
		nNode.data = "Im";
		nNode.link = h.link;
		h.link = nNode;
		
		System.out.println(h.data);
		System.out.println(h.link.data);
		System.out.println(h.link.link.data);
		System.out.println(h.link.link.link.data);
		System.out.println(h.link.link.link.link.data);
		System.out.println(h.link.link.link.link.link.data);
		
		LinkedList linklst = new LinkedList();
		linklst.head.data = "kim";
		linklst.head.link = null;
		linklst.length = 1;
		System.out.println(linklst.head.data);
		
	}
}

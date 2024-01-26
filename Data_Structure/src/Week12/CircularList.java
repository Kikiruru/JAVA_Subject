package Week12;

public class CircularList {
	private ListNode tail;
	
	public CircularList() {
		tail = null;
	}
	
	public int size() {
		int length = 0;
		ListNode newNode = tail;
		do{
			length++;
			newNode = newNode.link;
		}while(newNode != null && newNode != tail);
		return length;
	}
	
	
	public void addFirst(int x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		
		if(tail == null) {
			newNode.link = newNode;
			tail = newNode;
		}
		else {
			newNode.link = tail.link;
			tail.link = newNode;
		}
	}
	
	public void addLast(int x) {
		ListNode newNode = new ListNode();
		ListNode temp;
		newNode.data = x;
		
		if(tail == null) {
			newNode.link = newNode;
			tail = newNode;
		}
		else {
			temp = tail;
			tail = newNode;
			tail.link = temp.link;
			temp.link = tail;
		}
	}
	
	public ListNode listSearch(int data) {
		ListNode findNode = tail.link;
		do {
			if(findNode.data == data) return findNode;
			findNode = findNode.link;
		} while(findNode != tail.link);
		return null;
	}
	
	public void insert(ListNode p, int x) {
		ListNode newNode = new ListNode();
		ListNode temp;
		newNode.data = x;
		if(p == null) { // 첫노드로 삽입 addFirst(x)
			newNode.link = tail.link;
			tail.link = newNode;
		}
		else if(tail == null) {
			newNode.link = newNode; // addFirst(x), addLast(x)
			tail = newNode;
		}
		else if(p == tail) { // addLast(x)
			temp = tail;
			tail = newNode;
			tail.link = temp.link;
			temp.link = tail;
		}
		else {
			newNode.link = p.link;
			p.link = newNode;
		}
	}
	
	public void delete(ListNode p) { //p 옆에 노드를 삭제
		if(tail == null) { //첫 노드 삭제
			return; //빈노드
		}
		else if(p == null) { //첫 노드 삭제
			tail.link = tail.link.link;
		}
		else if(p.link == tail) {
			tail = p;
			p.link = p.link.link;
		}
		else {
			p.link = p.link.link;
		}
	}
	
	public void print() {
		ListNode temp = tail;
		if(temp == null) return;
		do{
			temp = temp.link;
			System.out.print(temp.data +"  ");
		}while(temp != tail);
		System.out.println("\nsize : "+ size());
	}
}

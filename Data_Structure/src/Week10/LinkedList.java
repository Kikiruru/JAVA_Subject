package Week10;

public class LinkedList {
	private int length;
	private ListNode firstNode;
	
	public LinkedList() {
		length = 0;
		firstNode = null;
	}
	
	public int size() {
		return length;
	}
	
	public void addFirst(String x) {
		ListNode newNode = new ListNode(x, firstNode);
		firstNode = newNode;
		length++;
	}
	
	public void insert(ListNode p, String x) {
		ListNode newNode = new ListNode(x);
		if(firstNode == null) {
			firstNode = newNode;
			firstNode.link = null;
			length++;
		}
		else if(p == null) {
			newNode.link = firstNode;
			firstNode = newNode;
			length++;
		}
		else {
			newNode.link = p.link;
			p.link = newNode;
			length++;
		}
	}
	
	public void addLast(String x) {
		ListNode newNode = new ListNode(x);
		ListNode lastNode;
		
		if(firstNode == null) {
			firstNode = new ListNode();
			lastNode = firstNode;
		}
		else {
			lastNode = firstNode;
			while(lastNode.link != null)
				lastNode = lastNode.link;
		}
		lastNode.link = newNode;
		length++;
	}
	
	public void delete(ListNode p) {
		if(firstNode == null)
			return;
		else if(p == null)
			firstNode = firstNode.link;
		else
			p.link = p.link.link;
		length--;
	}
	
	public void reverse() {
		ListNode one = firstNode;
		ListNode two = null;
		ListNode three = null;
		while(one != null) {
			three = two;
			two = one;
			one = one.link;
			two.link = three;
		}
		firstNode = two;
	}
	
	public LinkedList ConcatList(LinkedList l2) {
		if(this.firstNode == null) return l2;
		else if(l2.firstNode == null) return this;
		ListNode p = firstNode;
		while(p.link != null) p = p.link;
		p.link = l2.firstNode;
		length += l2.length;
		return this;
	}
	
	public ListNode listSearch(String data) {
		ListNode findNode;
		findNode = firstNode;
		while(findNode != null) {
			if(findNode.data.equals(data))
				return findNode;
			findNode = findNode.link;
		}
		return null;
	}
	
	public void deleteLastNode() {
		ListNode p = firstNode;
		ListNode c = firstNode.link;
		if(firstNode == null) return;
		if(firstNode.link == null) {
			firstNode = firstNode.link;
			length--;
		}
		while(c != null) {
			p = c;
			c = c.link;
		}
		p.link = null;
		length--;
	}
	
	public void print() {
		ListNode temp;
		if(firstNode == null) return;
		temp = firstNode;
		for(int i = 0; i < length; i++) {
			System.out.println(i+1 +")Node Data : "+ temp.data);
			temp = temp.link;
		}
		System.out.println("List_Size : "+ size());
	}
}

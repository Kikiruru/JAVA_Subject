package Week14_2;

public class Stack {
	private ListNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int x) { //맨 위에 쌓음
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() { //맨 위에 원소 출력 
		if(isEmpty()) {
			return 0;
		}
		else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public void remove() { //맨 위에 원소 삭제 
		if(isEmpty()) return;
		else top = top.link;
	}
	
	public Object peak() { //맨 위에 원소 검색
		if(isEmpty()) return null;
		else return top.data;
	}
}

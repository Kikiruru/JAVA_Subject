package Week06_;

public class List {
	private int size;
	private char array[];
	private static final int MAX = 100;
	
	public List() {
		size = 0;
		array = new char[MAX];
	}
	
	
	public boolean isEmpty() {
		if(size == 0)
			return true;
		return false;
	}
	
	public int lenth() {
		return size;
	}
	
	public char retrieve(int j) {
		return array[j];
	}

	public void replace(int j, char item) {
		array[j] = item;
	}
	
	public void replaceByElem(char c, char c1) {
		for(int i = 0; i < size-1; i++) {
			if(array[i] == c)
				array[i] = c1;
		}
	}
	/*
	public void replaceByElem(char c, char c1){
		int i = 0;
		while(i < size && item[i] != c)
			i++;
		if(item[i] == x)
			item[i] = y;
	}
	 */
	
	public void delete(int j) {
		for(int i = j; i < size-1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}
	
	public void deleteByElem(char c) {
		for(int i = 0; i < size-1; i++) {
			if(array[i] == c)
				delete(i);
		}
	}
	
	public void insert(int j, char k) {
		size++;
		for(int i = 0; i < size-1-j; i++)
			array[size-1-i] = array[size-2-i];
		array[j] = k;
	}
	/*
	public void insert(int j, char k) {
		for(int i = size; i < j; i++)
			array[i] = array[i-1];
		array[j] = k;
		size++;
	}
	 */
	/*
	public void print() {
		System.out.println(array);
	}
	*/
	public void print() {
		for(int i = 0; i < size - 1; i++)
			System.out.print(array[i]);
		System.out.println();
	}
}

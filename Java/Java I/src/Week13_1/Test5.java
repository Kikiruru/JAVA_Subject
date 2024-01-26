package Week13_1;

class Person{
	private String name, address, phone; //이름, 주소, 전화번호
	
	public Person(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void setName(String name) { //생성자
		this.name = name;
	}
	
	public String getName() { //접근자
		return name;
	}
	
	public void setAddress(String adr) {
		address = adr;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPhone(String pnum) {
		phone = pnum;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s\t주소: %s\t\t전화번호: %s\n",name, address, phone);
	}
}

class Customer extends Person {
	private String customer, mile; //고객번호, 마일리지
	
	public Customer(String name, String adr, String phone, String cus, String mil) {
		super(name, adr, phone);
		customer = cus;
		mile = mil;
	}
	
	public void setCustomer(String cus) {
		customer = cus;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public void setMile(String mil) {
		mile = mil;
	}
	
	public String getMile() {
		return mile;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("고객번호: %s\t마일리지: %s\n", customer, mile);
	}
}

public class Test5 {
	public static void main(String[] args) {
		Person p = new Customer("김대성","원주", "010-1234-5678", "0001", "100");
		p.showInfo();
	}
}

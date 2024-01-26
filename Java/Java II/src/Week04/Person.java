package Week04;

class Person {
	private String name, address, phoneNumber;
	
	Person() {}
	
	Person(String name, String address){
		this.name = name; this.address = address;
		phoneNumber = "010-1234-5678";
	}
	
	Person(String name, String address, String phoneNumber){
		this.name = name; this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "이름 : "+ name +"\n주소 : "+ address
				+"\n전화번호 : "+ phoneNumber;
	}
}

class Customer extends Person {
	private int customerNumber;
	private int mileage;
	
	Customer(String name, String address, int cn, int mile)	{
		super(name, address);
		customerNumber = cn; mileage = mile;
	}
	
	Customer(String name, String address, String phoneNumber, int cn, int mile)	{
		super(name, address, phoneNumber);
		customerNumber = cn; mileage = mile;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int getMileage() {
		return mileage;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public String toString() {
		return super.toString() +"\n고객번호 : "+ customerNumber +
				"\n마일리지 : "+ mileage;
	}
}
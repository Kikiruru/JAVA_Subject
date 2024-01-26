package Week04;

class Employee {
	private String name, number; //이름, 사번
	
	Employee() {}
	Employee(String name, String number){
		this.name = name; this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int computeSalary()	{
		return 0;
	}
	
	public String toString() {
		return "이름 : "+ name +",   사번 : "+ number;
	}
}

class SalariedEmployee extends Employee	{
	private int salary;
	
	SalariedEmployee(String name, String number, int salary) {
		super(name, number); this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int computeSalary() {
		return salary * 12;
	}
	
	@Override
	public String toString() {
		return super.toString()	+",   급여 : "+ salary +",   연봉 : "
				+ computeSalary();
	}
}

class HourEmployee extends Employee	{
	private int wage, hour; //시급, 일한시간
	
	HourEmployee(String name, String number, int wage, int hour) {
		super(name, number);
		this.wage = wage; this.hour = hour;
	}

	public int getWage() {
		return wage;
	}

	public int getHour() {
		return hour;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	@Override
	public int computeSalary() {
		return wage * hour;
	}
	
	@Override
	public String toString() {
		return super.toString() +",   시간당 임금 : "+ wage
				+",   일한시간 : "+ hour +",   금액 : "+ computeSalary();
	}
}
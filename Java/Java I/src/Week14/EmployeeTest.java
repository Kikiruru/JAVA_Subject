package Week14;
import java.util.Scanner;
class Person{  //수퍼클래스
	private String name, compnum; //이름, 사번
	
	public Person(String na, String co) {
		name = na; compnum = co;
	}
	
	public String toString() {
		return "이름 : "+ name +",\t사번 : "+ compnum;
	}
}

class SalariedEmployee extends Person{
	private int salary; //월급
	
	public SalariedEmployee(String na, String co, int sal) {
		super(na,co);
		salary = sal;
	}
	
	public int computeSalary() {
		return salary * 12;
	}
	
	public String toString() {
		return super.toString()+",\t급여 : "+ salary +",\t연봉 : "+ computeSalary();
	}
}

class HourEmployee extends Person {  
	private int hwage, worktime; //시급, 일한시간
	
	public HourEmployee(String na, String co, int hw, int wt) {
		super(na, co);
		hwage = hw; worktime = wt;
	}
	
	public int computeSalary() {
		return hwage * worktime;
	}
	
	public String toString() {
		return super.toString() +",\t시간당 임금 : "+ hwage +",\t일한시간 : "+ worktime
				+",\t금액 : "+ computeSalary();
	}
}

class EmployeeTest{
   public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     Person[] person = new Person[100];
     boolean flag=true;
     int cnt = 0;
     
     while (flag) {
		System.out.print("1: Salaried 객체 생성, 2: Hour 객체 생성 3. 종료 --> ");
		int menu = in.nextInt();
		switch (menu) {
		case 1:	System.out.println("이름, 사번, 급여를 입력하세요");
			person[cnt++] = new SalariedEmployee(in.next(), in.next(), in.nextInt());
			break;
		case 2:	System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요");
			person[cnt++] = new HourEmployee(in.next(), in.next(), in.nextInt(), in.nextInt());
			break;
		case 3:	flag = false;
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
     }
     
     System.out.println("------ 전체 레코드 출력 ------");
     for(int i = 0; i < cnt; i++) {
    	 System.out.println(person[i]);
     }
     System.out.println("프로그램을 종료합니다");
     in.close();
   }
}
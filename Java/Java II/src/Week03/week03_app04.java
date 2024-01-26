package Week03;

import java.util.Scanner;

public class week03_app04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Distance[] di;
		int num;
		String name;
		
		System.out.print(">> 생성하고자 하는 객체의 수를 입력하세요 : ");
		num = sc.nextInt();
		di = new Distance[num];
		
		for(int i = 0; i < di.length; i++) {
			System.out.print(">> 이름과 통학거리를 입력하세요 : ");
			name = sc.next();
			num = sc.nextInt();
			
			di[i] = new Distance(name, num);
		}
		
		System.out.println("\n통학거리가 가장 긴 학생 : "+ DistanceComp.longdistance(di).toString());
		System.out.println("통학거리가 가장 짧은 학생 : "+ DistanceComp.shortdistance(di).toString());
		
		System.out.print("통학거리가 가장 긴 학생과 가장 짧은 학생의 차이는 "+
		(DistanceComp.longdistance(di).getDist() - DistanceComp.shortdistance(di).getDist()) +"입니다");
		sc.close();
	}
}

package Week13_2;
import java.util.Scanner;
class Distance{
	private String name; //이름
	private int dist; //통학거리
	
	Distance(String name, int dist){
		this.name = name;
		this.dist = dist;
	}
	
	String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getDist() {
		return dist;
	}
	
	void setDist(int dist) {
		this.dist = dist;
	}
	
	public String toString() {
		return "Distance [이름="+ name +", 통학거리="+ dist +"]";
	}
}

class DistanceComp{
	static Distance longdistance(Distance[] dist){
		Distance dis;
		dis = dist[0];
		for(int i = 1; i < dist.length; i++) {
			if(dis.getDist() < dist[i].getDist())
				dis = dist[i];
		}
		return dis;
	}
	
	static Distance shortdistance(Distance[] dist){
		Distance dis;
		dis = dist[0];
		for(int i = 1; i < dist.length; i++) {
			if(dis.getDist() > dist[i].getDist())
				dis = dist[i];
		}
		return dis;
	}
}

public class DistanceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Distance[] dist;
		Distance longdist; //길이가 긴 학생 객체
		Distance shortdist; //길이가 짧은 학생 객체
		int cnt;
		
		System.out.print(">> 생성하고자 하는 객체의 수를 입력하세요 : ");
		cnt = in.nextInt();
		dist = new Distance[cnt];
		
		for(int i = 0; i < dist.length; i++) { //dist.length = cnt
			System.out.print(">> 이름과 통학거리를 입력하세요 : ");
			dist[i] = new Distance(in.next(), in.nextInt());
		}
		
		longdist = DistanceComp.longdistance(dist);
		System.out.print("통학거리가 가장 긴 학생 : ");
		System.out.println(longdist);
		shortdist = DistanceComp.shortdistance(dist);
		System.out.print("통학거리가 가장 짧은 학생 : ");
		System.out.println(shortdist);
		System.out.printf("통학거리가 가장 긴 학생과 짧은 학생의 차이는 %d 입니다", longdist.getDist() - shortdist.getDist());
		in.close();
	}
}

package Weeek10;

public class Answer3 {
	 public static void main(String[] args) {
		 int d1 = (int)(Math.random()*15) + 1;
		 int d2 = (int)(Math.random()*15) + 1;
		 int max = big(d1, d2);
		 write("생성된 난수1 : ", d1);
		 write("생성된 난수2 : ", d2);
		 write("max : ", max);
	 }
	 
	 public static int big(int a, int b) {
		 int max = (a > b)? a : b;
		 return max;
	 }
	 
	 public static void write(String str, int a) {
		 System.out.println(str + a);
	 }
}

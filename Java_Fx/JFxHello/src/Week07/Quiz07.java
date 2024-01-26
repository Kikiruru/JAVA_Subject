package Week07;

public class Quiz07 {
	public static void main(String[] args) {
		int[][] aa = new int[2][];
		aa[0] = new int[2];
		aa[1] = new int[3];
		
		for(int i = 0; i < aa.length; i++) {
			for(int k = 0; k < aa[i].length; k++) {
				System.out.println("aa["+ i +"]["+ k +"]="+ aa[i][k]);
			}
		}
	}
}

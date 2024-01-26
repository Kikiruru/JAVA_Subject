package Week09;

public class Week09_Test {
	public static void main(String[] args) {
	    int[][] dim= {{3,5,2}, {5,8,3}};  //2행 3열인 행렬 
	    for(int i=0; i<dim.length;i++){   
	    	for(int j=0; j<dim[i].length; j++)
	        System.out.print(dim[i][j]+ "\t");  //배열 원소 출력
	    System.out.println();
	    }
	}
}
// arr[5][2] : 행의 길이 5 -> arr.length, 열의 길이 2 -> arr[x].length
/* 00
 * 00
 * 00
 * 00
 * 00
 */

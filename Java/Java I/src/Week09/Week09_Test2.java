package Week09;

public class Week09_Test2 {
	
	public static void init_array(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = 0;
		}
	}
	
	public static void write(int[] arr, String str){
		System.out.println(str);
			for(int i = 0; i <arr.length; i++){
		 		System.out.print(arr[i] +"\t");
		}
	}

	
	public static void main(String[] args) {
		int[] arr1=new int[7];
		System.out.println("배열을 초기화 합니다");
			init_array(arr1);
		System.out.println("배열 원소를 출력 합니다");
			write(arr1, "배열 : arr1");
	}
}

package Week09_2;

public class Test {
	public static void main(String[] args) {
		try {
			sub();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try  { 
		   //int x = 0; 
		   // int y = 5 / x; 
		} 
		catch (ArithmeticException ae)  {
		    System.out.println(" Arithmetic Exception"); 
		}
		catch (Exception e)  {
		    System.out.println("Exception"); 
		} 
		System.out.println("finished");

	}
	
	public static void sub() throws Exception {
		//int[] array = new int[10];
		//int i = array[10];
	}
}

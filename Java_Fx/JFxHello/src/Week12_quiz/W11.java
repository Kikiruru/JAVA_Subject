package Week12_quiz;

public class W11 {
	public static void main(String[] args) {
		int status = 0;
		String[] data = {"11", "2a", "2147483648"};
		for(int i = 0; i < 4; i++)
		{
			try { //빈칸
				System.out.println(Integer.parseInt(data[i]));
			}
			catch (ArrayIndexOutOfBoundsException e) {
				status += 1;
				System.out.println("Exception : Out of range");
			}
			catch (NumberFormatException e) {
				status += 2;
				System.out.println("Exception : Formatting Error");
			}
			finally {
				System.out.println("Status is : "+ status);
			}
		}
	}
}

package classpart;

public class FunctionTest {
	public static void main(String [] args) {
		
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1+ " + " + num2 + " = " + sum);
		// 10 + 20 = 30
			
	}
	public static int add(int num1, int num2) {
		return num1+num2;
	}
}

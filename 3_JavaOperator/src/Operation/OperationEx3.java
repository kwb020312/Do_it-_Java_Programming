package Operation;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean value = ((num1 = num1+100) < 20) && ((num2 = num2+100000) < 1);
		
		System.out.println(num2); // print 2, AND 연산자에서 첫 조건이 false 이므로 두번째 조건은 실행되지 않음
		
		boolean value2 = ((num1 = num1+10) > 1) || ((num2 = 1000) > 5);
		
		System.out.println(num2); // print 2, OR 연산자에서 첫 조건이 true 이므로 두번째 조건은 실행되지 않음
	}
}

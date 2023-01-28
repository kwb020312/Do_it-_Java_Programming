package LoopStatement;

public class ContinueExample {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 10; i ++) {
			if(i % 2 == 0) continue;
			sum += i;
		}
		System.out.println("1~10까지의 수 중 홀수의 합은: "+sum);
		// "1~10까지의 수 중 홀수의 합은: 25"
	}

}

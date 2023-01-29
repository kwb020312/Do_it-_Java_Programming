package LoopStatement;

public class BreakExample1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		for( ;  ; num++) {
			sum+=num;
			if(sum >= 100) break;
		}
		System.out.println("총 합이 100이 될 때까지 더한다면 "+num+"번에서 끝난다.");
		// "총 합이 100이 될 때까지 더한다면 14번에서 끝난다."
	}

}

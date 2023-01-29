package LoopStatement;

public class WhileExample1 {

	public static void main(String[] args) {
		int sum =0;
		int idx = 0;
		while(idx < 10) {
			sum+=idx+1;
			idx++;
		}
		System.out.println("1부터 10까지의 합은: "+sum);
		// print "1부터 10까지의 합은: 55"
	}

}

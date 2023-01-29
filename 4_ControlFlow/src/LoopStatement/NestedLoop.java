package LoopStatement;

public class NestedLoop {

	public static void main(String[] args) {
		for(int dan = 1 ; dan <= 9 ; dan++) {
			for(int times = 1; times <= 9 ; times ++) {
				System.out.println(dan+" * "+times+" = "+ dan*times);
			}
		}
		
		// 2 * 1 = 2 ...
		// 9 * 9 = 81
	}
	
}

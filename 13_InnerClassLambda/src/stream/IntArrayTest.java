package stream;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum(); // 저장된 값을 모두 더함
		int count = (int) Arrays.stream(arr).count();
		System.out.println(sumVal);
		System.out.println(count);
	}

}

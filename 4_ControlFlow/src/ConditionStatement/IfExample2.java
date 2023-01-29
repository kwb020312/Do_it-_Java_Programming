package ConditionStatement;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int value;
		if(age < 8) {
			value = 500;
		} else if(age < 14) {
			value = 1000;
		} else {
			value = 2000;
		}
		System.out.println(value); // print 1000
	}

}

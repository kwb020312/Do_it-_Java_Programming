package ConditionStatement;

public class SwitchCase {

	public static void main(String[] args) {
		int grade = 1;
		String color;
		switch(grade) {
			case 1:
				color = "gold";
				break;
			
			case 2:
				color = "silver";
				break;
				
			case 3:
				color = "bronze";
				break;
			default:
				color="No Color";
				break;
		}
		
		
			
		System.out.println(color); // print "gold"
	}

}

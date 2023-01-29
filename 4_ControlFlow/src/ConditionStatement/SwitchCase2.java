package ConditionStatement;

public class SwitchCase2 {

	public static void main(String[] args) {
		String color = "gold";
		switch(color) {
			case "gold":
				System.out.println("금메달 입니다.");
				break;
			
			case "silver":
				System.out.println("은메달 입니다.");
				break;
				
			case "bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("수상에 실패했습니다.");
				break;
		}
		// print "금메달 입니다."

	}

}

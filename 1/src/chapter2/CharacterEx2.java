package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; // print '한' 유니코드 변환
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int ch3 = -1;
		
		System.out.println((char)ch3); // 음수는 문자형으로 변경 불가 print ? 

	}

}

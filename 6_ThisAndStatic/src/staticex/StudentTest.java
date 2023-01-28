package staticex;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // 1000
		studentLee.serialNum++; // static 변수 값 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); // 1001
		System.out.println(studentLee.serialNum); // 1001
	}

}

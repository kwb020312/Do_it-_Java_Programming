package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 하나의 클래스로 여러개의 인스턴스를 조작할 수 있음
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.setStudentName("김우빈");
		st2.setStudentName("문관우");
		
		System.out.println(st1.getStudentName() + ' ' + st2.getStudentName());
		// print "김우빈 문관우"
	}

}

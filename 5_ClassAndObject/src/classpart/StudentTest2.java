package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.setStudentName("김우빈");
		st2.setStudentName("문관우");
		
		// 참조 변수 주소값  출력
		System.out.println(st1);
		System.out.println(st2);
		
		/*
			classpart.Student@5ca881b5
			classpart.Student@24d46ca6
		 */
	}

}

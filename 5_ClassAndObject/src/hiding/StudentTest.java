package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentName("김우빈");
		
		System.out.println(st.getStudentName()); // print "김우빈"
	}

}

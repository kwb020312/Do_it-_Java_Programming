package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName+" , "+ address); // 이름, 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// main
	public static void main(String [] args) {
		Student st = new Student();
		st.studentName = "김우빈";
		System.out.println(st.studentName); // print "김우빈"
		System.out.println(st.getStudentName()); // print "김우빈"
	}
}

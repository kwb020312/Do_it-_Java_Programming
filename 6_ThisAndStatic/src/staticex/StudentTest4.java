package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum()); // 1001
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum()); // 1002
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
	}

}

package object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee; // �ּ� ����
		Student studentSang = new Student(100, "�̻��");
		
		// ��ȣ�� ��
		if(studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}
		
		// equals �޼���� ��
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		} else {
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		}
		
		// ��ȣ�� ��
		if(studentLee == studentSang) {
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		}
		
		// equals �޼���� ��
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		} else {
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		}
		
		// hashCode ������
		
		System.out.println("studentLee�� hashCode :" + studentLee.hashCode());
		System.out.println("studentSang�� hashCode :" + studentSang.hashCode());
		
		System.out.println("studentLee�� ���� �ּڰ� :" + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּڰ� :" + System.identityHashCode(studentSang));
	}
}

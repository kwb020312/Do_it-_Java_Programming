package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstacne();
		Company myCompany2 = Company.getInstacne();
		
		// 싱글톤 방식으로 제작된 클래스의 주소값이 같은지 확인
		System.out.println(myCompany1 == myCompany2);
	}

}

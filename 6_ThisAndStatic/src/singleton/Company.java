package singleton;

public class Company {
	// 싱글톤 방식의 클래스 제작
	private static Company instance = new Company();

	private Company() {
		
	}
	
	public static Company getInstacne() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}

package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1); // Person("이름 없음", 1) 과 같다.
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this; // this 반환
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name); // 이름없음
		System.out.println(noName.age); // 1
		
		Person p = noName.returnItSelf();
		System.out.println(p); 
		System.out.println(noName);
	}

}

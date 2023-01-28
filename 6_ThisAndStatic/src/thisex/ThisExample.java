package thisex;

public class ThisExample {
	public static void main(String [] args) {
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		// bDay와 실제 Class의 주소가 같다.
	}
}

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}


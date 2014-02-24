public class BirthDay {
	int day;
	int month;
	int year;

	public void Day(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	public void display() {
		System.out.println("您的生日为:" + day + "/" + month + "/" + year);
	}

	public int GetDay() {
		return day;
	}

	public void SetDay(int day) {
		this.day = day;
	}

	public int GetMonth() {
		return month;
	}

	public void SetMonth(int month) {
		this.month = month;
	}

	public int GetYear() {
		return year;
	}

	public void SetYear(int year) {
		this.year = year;
	}

}

public class TestBirthDay {
	public static void main(String[] args) {
		BirthDay BirthDay1 = new BirthDay();
		BirthDay1.day = 12;
		BirthDay1.month = 8;
		BirthDay1.year = 2014;
		BirthDay1.display();
		BirthDay1.SetYear(2016);
		BirthDay1.display();

		BirthDay BirthDay2 = new BirthDay();
		BirthDay2.year = 2012;
		BirthDay2.month = 11;
		BirthDay1.display();
	}
}

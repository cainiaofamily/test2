public class TestPerson {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("ABC");
		Person person3 = new Person("ABC", 23);

		person1.display();

		person2.display();

		person3.display();
	}
}

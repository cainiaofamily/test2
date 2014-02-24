public class Person {
	String name;
	int age;

	Person() {

		name = "ABC";
		age = 20;

	}

	public Person(String _name) {
		name = _name;
		age = 20;
	}

	Person(String _name, int _age) {
		name = _name;
		age = _age;
	}

	void display() {
		System.out.println(name + age + "Ëê");
	}
}

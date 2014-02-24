package equal;

public class TestCat extends Cat {

	public TestCat(String color, int size) {
		super(color, size);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Cat kitty = new Cat("yellow", 10);

		Cat carry = new Cat("red", 10);

		System.out.println(kitty.equals(carry));

	}
}

package GoldenMonkey;

public class GoldenMonkey extends Animal implements Protected, Valuable {

	@Override
	public void valuable() {
		System.out.println("有价值的动物");
	}

	@Override
	public void Protect() {
		System.out.println("受保护的动物");

	}

}

package GoldenMonkey;

public class GoldenMonkey extends Animal implements Protected, Valuable {

	@Override
	public void valuable() {
		System.out.println("�м�ֵ�Ķ���");
	}

	@Override
	public void Protect() {
		System.out.println("�ܱ����Ķ���");

	}

}

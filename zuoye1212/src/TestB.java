public class TestB {
	public static void main(String[] args) {
		Calculator TestB = new Calculator();

		TestB.a = 12;
		TestB.b = 6;
		TestB.add();// ���üӷ�����

		new TestB();
		TestB.a = 12;
		TestB.b = 2;
		TestB.delate();// ���ü�������

		new TestB();
		TestB.a = 18;
		TestB.b = 2;
		TestB.multiply();// ���ó˷�����

		new TestB();
		TestB.a = 20;
		TestB.b = 4;
		TestB.division();// ���ó�������
	}
}

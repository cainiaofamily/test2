public class TestB {
	public static void main(String[] args) {
		Calculator TestB = new Calculator();

		TestB.a = 12;
		TestB.b = 6;
		TestB.add();// 调用加法运算

		new TestB();
		TestB.a = 12;
		TestB.b = 2;
		TestB.delate();// 调用减法运算

		new TestB();
		TestB.a = 18;
		TestB.b = 2;
		TestB.multiply();// 调用乘法运算

		new TestB();
		TestB.a = 20;
		TestB.b = 4;
		TestB.division();// 调用除法运算
	}
}

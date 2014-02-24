public class TestA {
	public static void main(String[] args) {

		FanZhuan TestA = new FanZhuan();
		TestA.b = 12345;
		System.out.print("翻转后的数字是");
		TestA.reverse();//直接调用翻转的方法

		new TestA();
		TestA.b = 745632972;
		System.out.print("翻转后的数字是");
		TestA.reverse();
	}

}

public class TestA {
	public static void main(String[] args) {

		FanZhuan TestA = new FanZhuan();
		TestA.b = 12345;
		System.out.print("��ת���������");
		TestA.reverse();//ֱ�ӵ��÷�ת�ķ���

		new TestA();
		TestA.b = 745632972;
		System.out.print("��ת���������");
		TestA.reverse();
	}

}

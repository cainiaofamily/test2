public class FanZhuan {
	int b;

	public void reverse() {
		while (b != 0) {
			int a = b % 10;
			System.out.print(a);
			b /= 10;
		}
		System.out.println();
		// �����д�÷�ת�ķ���

	}
}
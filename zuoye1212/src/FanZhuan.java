public class FanZhuan {
	int b;

	public void reverse() {
		while (b != 0) {
			int a = b % 10;
			System.out.print(a);
			b /= 10;
		}
		System.out.println();
		// 在这里，写好翻转的方法

	}
}
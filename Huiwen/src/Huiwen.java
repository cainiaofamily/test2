public class Huiwen {
	public static void main(String[] args) {
		int val = 12345;
		int r_digit;
		System.out.print("��ת��������ǣ�");
		while (val != 0) {
			r_digit = val % 10;
			System.out.print(r_digit);
			val = val / 10;
		}

	}
}

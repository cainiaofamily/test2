

public class Flower {
	public static void main(String[] args) {
		int i = 100;
		while (i < 1000) {
			int a00 = i / 100;//��λ����ȡ
			int a0 = ((i - a00 * 100) / 10);//ʮλ����ȡ
			int a = i % 10;//��λ����ȡ
			int c = (a00 * a00 * a00) + (a0 * a0 * a0) + (a * a * a);
			if (i == c) {
				System.out.println("���ˮ�ɻ�����"+i );
			}
			i++;System.out.println();
		}
	}
}

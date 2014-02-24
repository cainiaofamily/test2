

public class Flower {
	public static void main(String[] args) {
		int i = 100;
		while (i < 1000) {
			int a00 = i / 100;//百位数获取
			int a0 = ((i - a00 * 100) / 10);//十位数获取
			int a = i % 10;//个位数获取
			int c = (a00 * a00 * a00) + (a0 * a0 * a0) + (a * a * a);
			if (i == c) {
				System.out.println("输出水仙花数："+i );
			}
			i++;System.out.println();
		}
	}
}

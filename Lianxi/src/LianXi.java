public class LianXi {
	public static void main(String[] args) {
		int i = 0, j = 0;
		while (i < 7) {
			if (j > 4) {
				System.out.println("**");
				i++;
				continue;

			}
			System.out.println("*");
			j++;
			i++;
		}

	}
}

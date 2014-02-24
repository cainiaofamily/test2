package GoldenMonkey;

public class TestAnimal {
	public static void main(String[] args) {
		GoldenMonkey Mokey1 = new GoldenMonkey();
		Mokey1.color = "black";
		System.out.println("动物颜色是:" + Mokey1.color);
		Mokey1.Protect();
		Mokey1.valuable();

	}

}

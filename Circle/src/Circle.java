import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		System.out.println("Please input the radius of a circle:");
		Scanner input = new Scanner(System.in); 
		double π = 3.14;
		Float r = input.nextFloat();
		//如果使用int类型，只可以输入整数，但是半径有可能不是整数
		int C =(int) (2*π*r);//强制输出周长为int类型
		double S =π*r*r;
		//或者int S =(int) (π*r*r)S本身是double类型的，也可以转换为int类型
		System.out.println("该圆的周长为：C="+2+"*"+π+"*"+r+"="+C);
		//结果是整数
		//System.out.println("该圆的周长为：C="+(2*π*r)+C);
		//结果是小数
		System.out.println("该圆的面积为：S="+π+"*"+r+"*"+r+"="+S);
		//System.out.println("该圆的面积为：S="+(π*r*r)+S);
	}
}

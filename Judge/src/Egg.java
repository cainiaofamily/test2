import java.util.Scanner;
public class Egg {
public static void main(String[] args) {
	
	System.out.println("这筐鸡蛋有多少个啊？");
	Scanner input = new Scanner(System.in);
    int eggNum = input.nextInt();
	if(eggNum < 5 ){
		
	System.out.println("那我吃了吧，就这几个");
	}
	else
	System.out.println("太多了，我要退货");
}
}

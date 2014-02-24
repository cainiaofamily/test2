import java.util.Scanner;
public class Call {
public static void main(String[] args) {
	System.out.println("请输入拨号代码：");
	Scanner input = new Scanner(System.in);
	int callNum = input.nextInt();
	switch(callNum){
	case 1:
	System.out.println("正在为您拨打您父亲的号码...");
	break;
	case 2:
		System.out.println("正在为您拨打您母亲的号码...");
		break;
	case 3:
		System.out.println("正在为您拨打您爷爷的号码...");
		break;
	case 4:
		System.out.println("正在为您拨打您奶奶的号码...");
		break;
	default:
		System.out.println("选择不对，重新选择您要拨打号码的编号！");
	}
}
}

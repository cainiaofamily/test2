import java.util.Scanner;


public class Ave {
public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	int classNum = 5;
	int stuNum = 1041902201;
	double sum = 0;
	Scanner scanner = new Scanner(System.in);
	while(stuNum <= 1041902205){	
		System.out.println("输入学生的成绩");
	double score = scanner.nextDouble();
	sum = score + sum;
	stuNum++;
	}
	double Ave = (sum/5);
	System.out.println("班级学员的平均成绩是："+sum+"/"+5+"="+Ave);
	
}
}

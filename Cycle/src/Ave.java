import java.util.Scanner;


public class Ave {
public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	int classNum = 5;
	int stuNum = 1041902201;
	double sum = 0;
	Scanner scanner = new Scanner(System.in);
	while(stuNum <= 1041902205){	
		System.out.println("����ѧ���ĳɼ�");
	double score = scanner.nextDouble();
	sum = score + sum;
	stuNum++;
	}
	double Ave = (sum/5);
	System.out.println("�༶ѧԱ��ƽ���ɼ��ǣ�"+sum+"/"+5+"="+Ave);
	
}
}

import java.util.Scanner;

public class ensyu01_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1小数点数を入力->");
		double A = in.nextDouble();

		System.out.println("2小数点数を入力->");
		double B = in.nextDouble();

		double avg = 0;
		double sum = 0;
		
		sum = A+B;
		avg = sum/2;
		
		System.out.println("A,Bの合計："+sum);
		System.out.println("A,Bの平均："+avg);
		in.close();
	}
}

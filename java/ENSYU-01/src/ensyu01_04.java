import java.util.Scanner;

public class ensyu01_04 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1値を入力->");
		int X = in.nextInt();
		System.out.println("2値を入力->");
		int Y = in.nextInt();
		System.out.println("3値を入力->");
		int Z = in.nextInt();
		
		int avg = 0;
		int sum = 0;
		
		sum = X+Y+Z;
		avg = sum/3;
		
		System.out.println("X,Y,Zの合計："+sum);
		System.out.println("X,Y,Zの平均："+avg);
		in.close();
	}
}

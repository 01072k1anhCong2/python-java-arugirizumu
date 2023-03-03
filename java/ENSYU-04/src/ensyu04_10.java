
import java.util.Scanner;

public class ensyu04_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("整数値を入力->");
		int intNum = in.nextInt();
		
		while(intNum<=0) { //入力した値が正の確認
			System.out.println("再度正の整数値を入力->");
			intNum = in.nextInt();
		}
		in.close();
		
		int sum=0;
		
		for(int i=1;i<=intNum;i++) {
			sum+=i;
		}
		
		System.out.print("和："+sum);

		
	}
}

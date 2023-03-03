
import java.util.Scanner;

public class ensyu04_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("整数値を入力->");
		int intNum = in.nextInt();
		int i;
		while(intNum<0) {
			System.out.println("再度正の整数値を入力->");
			intNum = in.nextInt();
		}
		in.close();
		
		for(i=intNum;i>=0;i--) {
			System.out.print(i+" ");
		}
		System.out.println("終了後："+i);
		
		
		
	}
}

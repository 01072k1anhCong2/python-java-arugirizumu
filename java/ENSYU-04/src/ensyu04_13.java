
import java.util.Scanner;

public class ensyu04_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("整数を入力->");
		int inNum = in.nextInt();
		
		while(inNum<=0) { //入力した値が正の確認
			System.out.println("再度正の整数値を入力->");
			inNum = in.nextInt();
		}
		in.close();
		
		
		for(int i=0; i<=inNum; i++) {
			System.out.print("※");
			
			if (i%5==0) {
				System.out.println("");
			}
		}
	}
}

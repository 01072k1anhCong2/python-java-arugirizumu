
import java.util.Scanner;

public class ensyu04_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("整数値を入力->");
		int intNum = in.nextInt();
		
		while(intNum<=0) { //入力した値が正の確認
			System.out.println("再度正の整数値を入力->");
			intNum = in.nextInt();
		}
		in.close();
		
		for(int i=1;i<=intNum;i++) {
			if(i%2==0) {//偶数なら「+」を表示
				System.out.print("+");
			} else {//奇数なら「+」を表示
				System.out.print("*");
			}
			
		}
		
	}
}

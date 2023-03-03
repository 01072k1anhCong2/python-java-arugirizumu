
import java.util.Scanner;

public class ensyu04_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("段数を入力->");
		int inNum = in.nextInt();
		
		while(inNum<=0) { //入力した値が正の確認
			System.out.print("再度正の整数値を入力->");
			inNum = in.nextInt();
		}
		
		in.close();
		int cont=0;
		for(int i=1;i<=inNum;i++,cont++) {
			
			
			for(int j=inNum;j>i;j--) {
				System.out.print(" ");
			}

			for(int k=1;k<=(i+cont);k++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}
}

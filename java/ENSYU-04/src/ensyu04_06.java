
import java.util.Scanner;

public class ensyu04_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("何個「▲」を表示しますか->");
		int intNum = in.nextInt();
		
		while(intNum<=0) {
			System.out.println("再度正の整数値を入力->");
			intNum = in.nextInt();
		}
		in.close();
		
		for(int i=0;i<intNum;i++) {
			System.out.print("▲");
		}
		
	}
}

import java.util.Random;
import java.util.Scanner;


public class ensyu04_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("整数値を入力->");
		int intNum = in.nextInt();
		int ranNum = rand.nextInt(90)+10; //１０以上９９以下
			
		while (intNum!=ranNum) {
			if(intNum>ranNum) { //より大きい
				System.out.println("より大きい");
				intNum = in.nextInt();
			} else { //より小さい
				System.out.println("より小さい");
				intNum = in.nextInt();
			}
			
		}System.out.println("当たり！");

		in.close();
		
	}
}

import java.util.Scanner;

public class ensyu03_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum1 = in.nextInt();

		System.out.println("整数値を入力->");
		int inputNum2 = in.nextInt();
			
		
		
		if(inputNum2%inputNum1==0) {
			System.out.println("B"+inputNum2+"値はA"+inputNum1+"値の約数です。");
		} else {
			System.out.println("B"+inputNum2+"値はA"+inputNum1+"値の約数ではありません。");
		}
		
		
		in.close();
	}
}

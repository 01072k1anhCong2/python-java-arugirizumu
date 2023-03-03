import java.util.Scanner;

public class ensyu03_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum = in.nextInt();
			
		if(inputNum<0) {
			System.out.println("その値は負です。");
		}
		in.close();
	}
}

import java.util.Scanner;

public class ensyu01_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("数字を入力->");
		int num = in.nextInt();
		
		if (num%3==0) {
			System.out.println(Math.pow(num, 4));
		}
		else {
			System.out.println("終了");
		}

		in.close();
	}
}

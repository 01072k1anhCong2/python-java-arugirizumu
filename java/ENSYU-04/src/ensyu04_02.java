import java.util.Scanner;

public class ensyu04_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int a = in.nextInt();
			
		while (a<100 || a>999) {
			System.out.println("値が範囲以外で整数値を再入力->");
			a = in.nextInt();
		}
		System.out.println(a + "が入力されました");
		in.close();
		
	}
}

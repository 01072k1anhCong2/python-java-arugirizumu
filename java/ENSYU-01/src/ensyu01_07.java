import java.util.Scanner;

public class ensyu01_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("整数値(4桁)を入力->");
		int num = in.nextInt();
		
		int rem = num%10;
		num=num/10;
		
		System.out.println("最下位桁を除いた値は" + num + "です。");
		System.out.println("最下位桁は"+rem+"です。");
		
		in.close();
	}
}

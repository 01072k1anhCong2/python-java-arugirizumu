import java.util.Scanner;

public class ensyu07_04 {
	public static int sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.print(i+"=");
			}
			else {
				System.out.print(i+"+");
			}
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("和の何番までを入力->");
		int inp = in.nextInt();
		System.out.println("1から"+inp+"までの和：");
		System.out.println(sum(inp));
		in.close();
	}
}

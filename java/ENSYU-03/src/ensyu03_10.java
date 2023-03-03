import java.util.Scanner;

public class ensyu03_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値1を入力->");
		int a = in.nextInt();
		
		System.out.println("整数値2を入力->");
		int b = in.nextInt();
	

		if (a<b){
            int temp = a;
			a=b;
            b=temp;
		}
		
		System.out.println("変数Aは " + a + " です。");
		System.out.println("変数Bは " + b + " です。");
	
		in.close();
	}
}

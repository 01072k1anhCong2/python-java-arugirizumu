import java.util.Scanner;

public class ensyu04_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			System.out.println("整数値を入力->");
			int a = in.nextInt();
			
			if (a==0) {
				System.out.println("その値は0です");
			}else if(a>0){
				System.out.println("その値は正です");
			}else {
				System.out.println("その値は負です");
			}
			
		}
		in.close();
		
	}
}

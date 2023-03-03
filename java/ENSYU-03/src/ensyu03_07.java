import java.util.Scanner;

public class ensyu03_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum = in.nextInt();
			
		if (inputNum<60){
			System.out.println("不可");
		} else if (inputNum<70){
			System.out.println("可");
		} else if (inputNum<80){
			System.out.println("良");
		} else {
			System.out.println("優");
		}
		
		
		in.close();
	}
}

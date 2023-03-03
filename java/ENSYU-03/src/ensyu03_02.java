import java.util.Scanner;

public class ensyu03_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum = in.nextInt();
			
		if(inputNum<0) {
			inputNum*=-1;
		}
		
		System.out.println("絶対値は"+inputNum);
		in.close();
	}
}

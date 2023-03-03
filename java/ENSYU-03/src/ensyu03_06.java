import java.util.Scanner;

public class ensyu03_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum = in.nextInt();
			
		if (inputNum<0){
			System.out.println("正でない値が入力されました。");
		} else {
			if(inputNum%3==0) {
				System.out.println("その値" + inputNum + "は、３で割り切れます。");
			} else {
				int remainder = inputNum%3;
				System.out.println("その値" + inputNum + "を３で割った余りは"+remainder+"です。");
			}
		}
		
		
		in.close();
	}
}

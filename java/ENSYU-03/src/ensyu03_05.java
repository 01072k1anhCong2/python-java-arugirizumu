import java.util.Scanner;

public class ensyu03_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum = in.nextInt();
			
		if (inputNum<0){
			System.out.println("正でない値が入力されました。");
		} else {
			if(inputNum%5==0) {
				System.out.println("その値" + inputNum + "は、5で割り切れます。");
			} else {
				System.out.println("その値" + inputNum + "は、5で割り切れません。");
			}
		}
		
		
		in.close();
	}
}

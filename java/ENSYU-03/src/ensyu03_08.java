import java.util.Scanner;

public class ensyu03_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値1を入力->");
		int inputNum1 = in.nextInt();
		
		System.out.println("整数値2を入力->");
		int inputNum2 = in.nextInt();
		
		int bigNum = inputNum1;
		int diff = inputNum1-inputNum2;
		
		if (inputNum1<inputNum2){
			bigNum=inputNum2;
			diff= inputNum2-inputNum1;
		} 
		
		System.out.println("大きい方：" + bigNum);
		System.out.println("差は：" + diff);

		
		
		in.close();
	}
}

import java.util.Random;
import java.util.Scanner;

public class ensyu02_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力->");
		int inputNum = in.nextInt();
		inputNum-=5;
		Random rand = new Random();
		int num = rand.nextInt(10)+inputNum;
		while(num!=10) {
		num = rand.nextInt(11)+inputNum;
		System.out.println(num);
			
		}
		in.close();
	}
}

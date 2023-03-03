
import java.util.Scanner;

public class ensyu04_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("整数値1を入力->");
		int intNum = in.nextInt();
		System.out.println("整数値2を入力->");
		int intNum2 = in.nextInt();
		
		if (intNum2<intNum) {
			int temp=intNum2;
			intNum2=intNum;
			intNum=temp;
		}
		
		for (int i=intNum;i<intNum2+1;i++) {
			System.out.print(i+" ");
		}

		in.close();
		
	}
}

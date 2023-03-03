
import java.util.Scanner;

public class ensyu04_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("何個加算しますか->");
		int inNum = in.nextInt();
		
		while(inNum<=0) { //入力した値が正の確認
			System.out.println("再度正の整数値を入力->");
			inNum = in.nextInt();
		}
		int sum=0;
		int avg=0;
		int count=0;
		
		for (int i=0;i<inNum;i++) {
			System.out.println("整数->");
			int a = in.nextInt();
			if(a<0) {
				System.out.println("負の数は加算しません。");
			}else {
				sum+=a;
				count++;
			}
		}
		
		avg=sum/count;
		
		System.out.println("合計："+sum);
		System.out.println("平均："+avg);
		
		in.close();
		
	}
}

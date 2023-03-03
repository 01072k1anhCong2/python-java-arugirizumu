/*
 * 
 */

import java.util.Scanner;

public class ensyu05_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("個数を入力->");
		int valCount = in.nextInt();
		
		while(valCount<=0) { //入力した値が正の確認
			System.out.print("再度正の整数値を入力->");
			valCount = in.nextInt();
		}
		int sum=0;
		int avg=0;
		int inpNum=0;
		for(int i=0; i<valCount; i++) {
			System.out.print("整数値を入力->");
			inpNum = in.nextInt();
			
			if((sum+inpNum)>1000) { //追加する前に1000を超えないように判断
				break;
			}
			
			sum += inpNum; //まだいける場合追加します
			
		}
		avg=sum/valCount;
		System.out.println("合計："+sum);
		System.out.println("平均："+avg);
		
		in.close();
	}
}

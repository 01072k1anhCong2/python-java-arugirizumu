/*
 * 
 */
import java.util.Scanner;

public class ensyu05_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("人数を入力->");
		int numUser = in.nextInt();
		int[] tbl = new int [numUser];
		
		int sum = 0;
		int avg = 0;
		int low = 100;
		int high = 0;
		
		for(int i=0; i<tbl.length; i++) {
			System.out.print("点数を入力->");
			tbl[i]=in.nextInt();
			sum+=tbl[i];
			
			if(tbl[i]>high) {
				high = tbl[i];
			}
			
			if(tbl[i]<low) {
				low = tbl[i];
			}
		}
		
		avg = sum/numUser;
		System.out.println("");
		System.out.println("合計：" + sum);
		System.out.println("平均：" + avg);
		System.out.println("最高点：" + high);
		System.out.println("最低点：" + low);
		
		in.close();
	}
}

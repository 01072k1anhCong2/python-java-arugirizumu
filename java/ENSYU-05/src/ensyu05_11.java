/*
 * 
 */
import java.util.Scanner;

public class ensyu05_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("要素数を入力->");
		int inpNum = in.nextInt();
		int[] tbl = new int [inpNum];
		if(inpNum!=0){
			for(int i=0; i<tbl.length; i++) {
				System.out.print("整数を入力->");
				tbl[i]=in.nextInt();
			}
			
			System.out.print("TBL={");
		} else{
			System.out.println("TBL={}");
		}
		
		for(int i=0; i<tbl.length; i++) {
			if(i==tbl.length-1){
				System.out.println(tbl[i]+"}");
			} else{
				System.out.print(tbl[i]+", ");
			}
		}

		in.close();
	}
}

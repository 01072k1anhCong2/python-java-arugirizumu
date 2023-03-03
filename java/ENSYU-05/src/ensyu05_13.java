/*
 * 
 */

import java.util.Scanner;

public class ensyu05_13 {
	public static void main(String[] args) {

		int loc=0;
		boolean found=false;

		Scanner in = new Scanner(System.in);
		System.out.print("要素数を入力->");
		int elemNum = in.nextInt();

		while(elemNum<=0) { //入力した値が正の確認
			System.out.print("再度正の整数値を入力->");
			elemNum = in.nextInt();
		}

		int[] tbl = new int [elemNum];
		
		for(int i=0; i<tbl.length; i++) {
			System.out.print("整数を入力->");
			tbl[i]=in.nextInt();
		}

		System.out.print("探索を入力->");
		int search = in.nextInt();

		for(int i=0; i<tbl.length; i++) {
			if(search==tbl[i]){
				loc=i;
				found=true;
				break;
			}
		}
		if (found){
			System.out.println("TBL["+loc+"]にあります。");
		}else {
			System.out.println("TBL[]にありません。");
		}
		in.close();
	}
}

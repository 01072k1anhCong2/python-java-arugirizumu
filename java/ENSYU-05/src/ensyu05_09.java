/*
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class ensyu05_09 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("要素数を入力->");
		int arraySize = in.nextInt();

		int limit = 0;

		while(arraySize<=0) { //入力した値が正の確認
			System.out.print("再度正の整数値を入力->");
			arraySize = in.nextInt();
		}

		int[] tbl = new int [arraySize]; //キーボードで要素を求めて配列を生成

		for(int i=0; i<tbl.length; i++) {
			int ranNum = rand.nextInt(10)+1; //１から１０の乱数を配列の格要素に代入
			tbl[i]=ranNum;
			if (tbl[i]>limit){
				limit = tbl[i];
			}
		}

		for(int k=0; k<tbl.length; k++) {
			System.out.print(tbl[k] + " "); //配列の値を表示
		}

		System.out.println("");
		//System.out.println("最大"+limit);

		for(int i = limit; i>0; i--){
			for(int j=0; j<tbl.length; j++){
				if(i>tbl[j]){
					System.out.print("  ");
				} else{
					System.out.print("* "); 
				}
			}
			System.out.println("");
		}

		for(int k=0; k<tbl.length; k++){
			if(k>9){
				int num=k%10;
				System.out.print(num + " ");
			}else {
			System.out.print(k + " ");
			}
		}
		
		in.close();

	}
}

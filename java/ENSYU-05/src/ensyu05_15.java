/*
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class ensyu05_15 {
	public static void main(String[] args) {
        Random rand = new Random();
		Scanner in = new Scanner(System.in);

		System.out.print("要素数を入力->");
		int elemNum = in.nextInt();
		int[] arr = new int [elemNum];

		boolean found = true;
		int count = 0;
		int r = 0;

		while (count<elemNum){
			r = rand.nextInt(10)+1;
			found = true;
			for (int i = 0; i<count; i++){
				if (arr[i] == r){
					found = false;
					break;
				}
			}

			if (found) {
				arr[count] = r;
				count++;
			} 
		}
		/*
		while(elemNum<=0 || elemNum>10) { //入力した値が正の確認
			System.out.print("再度正の整数値を入力->");
			elemNum = in.nextInt();
		}

		int[] tbl = new int [elemNum];
		
		for(int i=0; i<tbl.length; i++) {
            int ranNum = rand.nextInt(10)+1;
            
            if(i!=0){
                for(int j=0; j<i; j++){
                    while(tbl[j]==ranNum) {
                        ranNum = rand.nextInt(10)+1;
                    }
                }
            }

            tbl[i]=ranNum;
		}
		 */
		System.out.print("TBL={");

		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1){
				System.out.println(arr[i]+"}");
			} else{
				System.out.print(arr[i]+", ");
			}
		}

		in.close();
	}
}

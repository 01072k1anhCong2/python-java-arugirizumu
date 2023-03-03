/*
 * 
 */

import java.util.Scanner;

public class ensyu05_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		boolean end = false;
		for(int i=1;i<=10;i++) {
			int count=0;
			System.out.println("第"+i+"グループ");
			
			while(true && count<5) {
				System.out.print("整数->");
				int inpNum = in.nextInt();
				if(inpNum==88888) {
					break;
				} else if(inpNum==99999) {
					end=true;
					break;
				}
				sum+=inpNum;
				count++;
			}
			if(end) {
				break;
			}
				
		}
		System.out.println("合計は"+sum+"です。");
		in.close();
	}
}

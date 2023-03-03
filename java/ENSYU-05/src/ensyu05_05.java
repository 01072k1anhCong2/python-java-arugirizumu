/*
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class ensyu05_05 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int ranNum = rand.nextInt(100);
		
		boolean win = false;
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("0から99までの整数->");
			int inpNum = in.nextInt();
			if(ranNum==inpNum) {
				System.out.println("当たり！");
				win = true;
				break;
			}
		}
		
		if(!win) {
			System.out.println("外れ");
			System.out.println("正解："+ranNum);
		}
		
		
		in.close();
	}
}

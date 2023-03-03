import java.util.Scanner;

public class ensyu03_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値1を入力->");
		int a = in.nextInt();
		
		System.out.println("整数値2を入力->");
		int b = in.nextInt();
		
		System.out.println("整数値3を入力->");
		int c = in.nextInt();
		
		int bigNum = a;
		int smallNum = b;
		int medNum = c;
		
		if (a<b){
			if (a<c) {
				smallNum = a;
				if(b<c) { //c>b>a
					bigNum=c;
					medNum=b;
				} else { //b>c>a
					bigNum=b;
					medNum=c;
				}
			} else { // b>a>c
				smallNum = c;
				bigNum=b;
				medNum=a;
			}
		} else {
			if (a<c) { //c>a>b
				smallNum = b;
				bigNum=c;
				medNum=a;
			} else {
				if (b<c) { //a>c>b
					smallNum = b;
					bigNum=a;
					medNum=c;
				} else { //a>b>c
					smallNum = c;
					bigNum=a;
					medNum=b;
				}
			}	
		}
		
		System.out.println("最大の値" + bigNum);
		System.out.println("真ん中の値：" + medNum);
		System.out.println("最小の値" + smallNum);
	
		in.close();
	}
}

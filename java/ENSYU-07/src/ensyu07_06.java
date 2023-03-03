import java.util.Scanner;

public class ensyu07_06 {
	public static String season(int n) {
		switch(n) {
		case 1,2,12:
			return "冬";
		case 3,4,5:
			return "春";
		case 6,7,8:
			return "夏";
		case 9,10,11:
			return "秋";
		default:
			return "";
		}
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inp = 0;
		while(inp<1 || inp>12) {
			System.out.println("整数を入力->");
			inp = in.nextInt();
		}
		System.out.println(inp+"月は、"+season(inp)+"の季節です。");
		
		in.close();
	}
}

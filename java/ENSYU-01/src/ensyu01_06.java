import java.util.Scanner;

public class ensyu01_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("名前を入力->");
		String name = in.next();
		
		System.out.println("年を入力->");
		int year = in.nextInt();
		System.out.println("月を入力->");
		int month = in.nextInt();
		System.out.println("日を入力->");
		int day = in.nextInt();
		
		System.out.println("私の名前は" + name + "です。");
		System.out.println("今日の日付は"+year+"年"+month+"月"+day+"日です。");
		
		in.close();
	}
}

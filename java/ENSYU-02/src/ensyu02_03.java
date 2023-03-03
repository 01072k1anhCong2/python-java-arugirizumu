import java.util.Scanner;
public class ensyu02_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("姓を入力->");
		String famName = in.next();
		System.out.println("名前を入力->");
		String firstName = in.next();
		
		System.out.println("こんにちは" + famName + "姓 " + firstName + "名さんですね。");
		in.close();
	}
}

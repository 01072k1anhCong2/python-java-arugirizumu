import java.util.Random;

public class ensyu02_05 {
	public static void main(String[] args) {
		Random rand = new Random(); //乱数を作成
		int num = rand.nextInt(10);
		System.out.println("今日のラッキーナンバーは"+num+"番です");
	}
}

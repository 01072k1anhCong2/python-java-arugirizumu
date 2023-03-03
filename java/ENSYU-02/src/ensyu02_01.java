import java.util.Random;

public class ensyu02_01 {
	public static void main(String[] args) {
		Random rand = new Random(); //乱数を作成
		int num = 1 + rand.nextInt(9); //1以上９以下
		
		System.out.println(num);
		
		int num2 = rand.nextInt(9)-9; //－９以上－１以下
		
		System.out.println(num2);
		
		int num3 = rand.nextInt(90)+10; //１０以上９９以下
		
		System.out.println(num3);

		
	}
}

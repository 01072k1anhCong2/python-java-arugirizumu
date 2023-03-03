import java.util.Random;

public class ensyu03_12 {
	public static void main(String[] args) {
		Random rand = new Random(); //乱数を作成
		int num = rand.nextInt(3);
		
		switch (num){
			case 0:
				System.out.println("グー");
				break;
			case 1:
				System.out.println("チョキ");
				break;
			case 2:
				System.out.println("パー");
				break;
		}
	}
}

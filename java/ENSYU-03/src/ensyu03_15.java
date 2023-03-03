
import java.util.Scanner;

public class ensyu03_15 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("整数値を入力->");
		int input = in.nextInt();
        switch (input){
            case 0:
			case 1:
            case 2:
            case 3:
            case 4:
            case 24:
                System.out.println("真夜中に失礼します");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("おはようございます");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("こんにちは");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("こんばんは");
                break;
            case 21:
            case 22:
            case 23:
                System.out.println("遅くに失礼します");
                break;
            default:
                System.out.println("そんな時間はありません！");
                break;
		}
        in.close();
    }
}

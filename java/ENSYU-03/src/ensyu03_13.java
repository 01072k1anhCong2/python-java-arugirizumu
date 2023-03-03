import java.util.Random;
import java.util.Scanner;

public class ensyu03_13 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("グー：０、チョキ：１、パー：２ を入力->");
		    int input = in.nextInt();
		    Random rand = new Random(); //乱数を作成
		    int num = rand.nextInt(3);

		    switch (num){
			    case 0:
                    switch (input){
                        case 0:
                            System.out.println("グー と グー : ドロー");
                            break;
                        case 1:
                            System.out.println("チョキ と グー : 敗");
                            break;
                        case 2:
                            System.out.println("パー と グー : 勝");
                            break;
                    }
				    break;
			    case 1:
                    switch (input){
                        case 0:
                            System.out.println("グー と チョキ : 勝");
                            break;
                        case 1:
                            System.out.println("チョキ と チョキ : ドロー");
                            break;
                        case 2:
                            System.out.println("パー と チョキ : 敗");
                            break;
                    }
				    break;
			    case 2:
				    switch (input){
                        case 0:
                            System.out.println("グー と パー : 敗");
                            break;
                        case 1:
                            System.out.println("チョキ と パー : 勝");
                            break;
                        case 2:
                            System.out.println("パー と パー : ドロー");
                            break;
                    }
				    break;
		    }
        }
		
        in.close();
	}
}

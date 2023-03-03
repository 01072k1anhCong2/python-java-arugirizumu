import java.util.Scanner;

public class ensyu08_10 {
    public static int min(int X, int Y) {
		int minNum = X;
		if (minNum>Y){
				minNum=Y;
		}
		return minNum;
	}

    public static int min(int X, int Y, int Z) {
		int minNum = X;
		if (minNum>Y){
				minNum=Y;
		}

        if (minNum>Z){
            minNum=Z;
    }
		return minNum;
	}
    //メイン
    public static int min(int[] TBL) {
		int minNum = TBL[0];
		for(int i=0; i<TBL.length; i++){
            if (minNum>TBL[i]){
                minNum = TBL[i];
            }
        }
		return minNum;
	}

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] TBL = new int[2];

        System.out.print("整数のAを入力->");
        int A = in.nextInt();
        System.out.print("整数のBを入力->");
        int B = in.nextInt();
        TBL[0] = min(A,B);
        System.out.println("A と B の最小値は" + TBL[0] + "です。");

        System.out.print("整数のAを入力->");
        A = in.nextInt();
        System.out.print("整数のBを入力->");
        B = in.nextInt();
        System.out.print("整数のCを入力->");
        int C = in.nextInt();
        TBL[1] = min(A,B,C);
        System.out.println("A と B と C の最小値は" + TBL[1] + "です。");

        System.out.println("配列TBLの最小値は" + min(TBL) + "です。");

        in.close();
    }
}

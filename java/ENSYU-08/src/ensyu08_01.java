import java.util.Scanner;
public class ensyu08_01 {
	//合計クラスメソッド
	public static int sumOF(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	//メイン
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("整数を入力->");
		int n = in.nextInt();
		int TBL[] = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("TBL["+i+"]を入力->");
			TBL[i] = in.nextInt();
		}
		//メソッド呼び出し戻り値表示させる
		System.out.println("合計："+sumOF(TBL));
		in.close();
	}
}

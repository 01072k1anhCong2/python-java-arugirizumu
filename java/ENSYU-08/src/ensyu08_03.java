import java.util.Scanner;
public class ensyu08_03 {
	//クラスメソッド
	public static void aryRmv(int[] arr, int index) {
		for(int i=index; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
	}
	//メイン
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("整数を入力->");
		int n = in.nextInt();
		int[] TBL = new int[n];
		for(int i=0; i<TBL.length; i++) {
			System.out.print("TBL["+i+"]->");
			TBL[i]=in.nextInt();
		}
		int index = -1;
		while(index<0 || index>TBL.length) {
			System.out.print("削除したい要素のインデックス->");
			index = in.nextInt();
		}
		//ユーザーが入力した値と配列を引数としてメソッド呼び出す
		aryRmv(TBL,index);
		System.out.print("TBL=[");
		for(int i=0; i<TBL.length; i++) {
			if(i==TBL.length-1) {
				System.out.print(TBL[i]+"]");
			}else {
				System.out.print(TBL[i]+",");
			}
		}
		
		in.close();
	}
}

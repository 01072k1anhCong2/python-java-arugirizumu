import java.util.Scanner;

public class ensyu08_02 {
	//最低値を求めるメソッド
	public static int minOF(int[] arr) {
		int minNum = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (minNum>arr[i]){
				minNum=arr[i];
			}
		}
		return minNum;
	}
	//メイン
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("人数を入力->");
		int nInp = in.nextInt();
		int[] arrH = new int[nInp];
		int[] arrW = new int[nInp];
		for (int i=0; i<nInp; i++) {
			System.out.println((i+1)+"人目の身長を入力->");
			arrH[i] = in.nextInt();
			System.out.println((i+1)+"人目の体重を入力->");
			arrW[i] = in.nextInt();
		}
		//メソッドを呼び出し結果が表示させる
		System.out.println("最も背が低い人の身長は"+minOF(arrH)+"cmです。");
		System.out.println("最も瘦せている人の体重は"+minOF(arrW)+"kgです。");
		in.close();
	}
}

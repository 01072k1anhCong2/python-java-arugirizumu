import java.util.Scanner;
//
public class ensyu08_04 {
	//番地にある値を上書きメソッド
	public static void aryRmvN(int[] arr, int n1, int n2) {
		int count = 0;

		int n3=n2;

		while(n3>(arr.length-(n1+n2))){
			n3--;
		}

		for(int i=n1;i<n1+n2;i++){
			if(n3-count==0){
				break;
			}
			arr[i]=arr[arr.length-(n3-count)];
			count++;
		}
	}
	//メイン
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] TBL = {1,3,4,7,9,11};
		int n1 = -1;
		while(n1<0 || n1>TBL.length) {
			System.out.print("何番地からを入力->");
			n1 = in.nextInt();
		}
		
		System.out.print("何個を入力->");
		int n2 = in.nextInt();
		aryRmvN(TBL,n1,n2);
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

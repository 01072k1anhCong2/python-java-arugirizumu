import java.util.Scanner;

public class ensyu08_08 {
    public static int[] arraySrchIdx(int[] TBL, int n){
        int[] arr = new int[TBL.length];
        int j = 0;
        for(int i=0; i<arr.length;i++){
            if(n==TBL[i]){
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
  //メイン
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] TBL = {1,5,4,8,5,5,7};
        System.out.print("整数を入力->");
        int n = in.nextInt();
        int[] TBLIND = new int[TBL.length];
        TBLIND = arraySrchIdx(TBL, n);

        System.out.print("TBLIND=[");
		for(int i=0; i<TBLIND.length; i++) {
			if(i>=0 && TBLIND[i+1]==0) {
				System.out.println(TBLIND[i]+"]");
                break;
			}else {
				System.out.print(TBLIND[i]+",");
			}
		}

        in.close();
    }
}

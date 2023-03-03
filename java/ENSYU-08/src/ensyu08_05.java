import java.util.Scanner;

public class ensyu08_05 {
    public static void aryIns(int[] arr, int pos, int num){
        for(int i=arr.length-1; i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
    }
    //メイン
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int pos = -1;
        int[] TBL = {1,3,4,7,9,11};
        while(pos<0 || pos>TBL.length-1){
            System.out.print("挿入したい位置->");
            pos = in.nextInt();
        }
        

        System.out.print("挿入する値->");
        int num = in.nextInt();
        aryIns(TBL, pos, num);
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

//import java.util.Scanner;

public class ensyu08_06 {
    public static void aryExchng(int[] tbla, int[] tblb){
        int minLength = tbla.length;
        if(tbla.length>tblb.length){
            minLength = tblb.length;
        }
        int temp = -1;

        for(int i=0; i<minLength; i++){
            temp=tbla[i];
            tbla[i]=tblb[i];
            tblb[i]=temp;
        }
    }
  //メイン
    public static void main(String[] args){
        
        int[] TBLA = {1,2,3,4,5,6,7};
        int[] TBLB = {5,4,3,2,1};

        aryExchng(TBLA,TBLB);

        System.out.print("TBLA=[");
		for(int i=0; i<TBLA.length; i++) {
			if(i==TBLA.length-1) {
				System.out.println(TBLA[i]+"]");
			}else {
				System.out.print(TBLA[i]+",");
			}
		}

        System.out.print("TBLB=[");
		for(int i=0; i<TBLB.length; i++) {
			if(i==TBLB.length-1) {
				System.out.println(TBLB[i]+"]");
			}else {
				System.out.print(TBLB[i]+",");
			}
		}
    }
}

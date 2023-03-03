
public class ensyu08_07 {
    public static int[] arrayClone(int[] TBLA){
        int[] arr = new int[TBLA.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = TBLA[i];
        }
        return arr;
    }
    //メイン
    public static void main(String[] args){
        int[] TBLA = {5,6,7,8,9};
        int[] TBLB = new int[4];

        TBLB = arrayClone(TBLA);

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

/*
 * 
 */

public class ensyu05_10 {
	public static void main(String[] args) {
		
		int[] tbl = {4, 10, 7, 7, 8, 6, 1, 3};
		System.out.print("TBL={");

		for(int i=0; i<tbl.length; i++) {
			if(i==tbl.length-1){
				System.out.println(tbl[i]+"}");
			} else{
				System.out.print(tbl[i]+", ");
			}
		}
	}
}

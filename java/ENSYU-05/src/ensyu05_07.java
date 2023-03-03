/*
 * 
 */

public class ensyu05_07 {
	public static void main(String[] args) {
		
		int[] tbl = new int [5];
		int countDown=5;
		for(int i=0; i<tbl.length; i++) {
			tbl[i]=countDown;
			countDown--;
			}
		
		for(int j=0; j<tbl.length; j++) {
			System.out.println(tbl[j]);
			}

	}
}

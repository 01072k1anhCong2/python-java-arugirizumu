/*
 * 
 */

public class ensyu05_08 {
	public static void main(String[] args) {
		
		double[] tbl = new double [5];
		double count=0;
		for(int i=0; i<tbl.length; i++) {
			count+=1.1;
			tbl[i]=count;
			}
		tbl[2]=3.3;
		for(int j=0; j<tbl.length; j++) {
			System.out.println(tbl[j]);
			}

	}
}

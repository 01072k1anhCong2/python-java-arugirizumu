import java.util.Scanner;

public class ensyu06_01 {
	public static void main (String[] args) {
		int[][] TBLA = new int [4][3];
		int[][] TBLB = new int [3][4];
		int[][] TBLC = new int [4][4];
		
		Scanner in = new Scanner (System.in);
		
		for(int i = 0; i<4; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print("TBLA"+i+" "+j+"の値->");
				TBLA[i][j]=in.nextInt();
			}
		}
		
		for(int i = 0; i<3; i++) {
			for (int j = 0; j<4; j++) {
				System.out.print("TBLB"+i+" "+j+"の値->");
				TBLB[i][j]=in.nextInt();
			}
		}
		
		for(int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				TBLC[j][i]=TBLA[j][0]*TBLB[0][i]+TBLA[j][1]*TBLB[1][i]+TBLA[j][2]*TBLB[2][i];
			}
			
		}
		
		System.out.println("--TBLC--");
		for(int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				System.out.print(TBLC[i][j]+" ");
			}
			System.out.println("");
		}
		in.close();
	}
}

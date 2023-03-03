import java.util.Scanner;
public class ensyu06_03 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("行数->");
		int row = in.nextInt();
		System.out.print("列数->");
		int column = in.nextInt();
		
		int[][] arr = new int[row][column];
		
		for (int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("値->");
				arr[i][j]=in.nextInt();
			}
		}
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		in.close();
	}
}

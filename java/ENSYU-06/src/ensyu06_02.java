import java.util.Scanner;
public class ensyu06_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr=new int[6][2];
		
		int sub1 = 0;
		int sub2 = 0;
		for(int i = 0; i<6; i++) {
			System.out.println("学生"+(i+1));
			for(int j = 0; j<2; j++) {
				switch(j) {
				case 0:
					System.out.print("国語の点数->");
					arr[i][j]=in.nextInt();
					break;
				case 1:
					System.out.print("数学の点数->");
					arr[i][j]=in.nextInt();
					break;
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<6; i++) {
			int studSum = 0;
			for (int j=0; j<2; j++) {
				switch(j) {
				case 0:
					//国語
					sub1+=arr[i][j];
					break;
				case 1:
					//数学
					sub2+=arr[i][j];
					break;
				}
				studSum+=arr[i][j];
				
			}
			System.out.println("学生"+(i+1)+": "+studSum/2);
		}
		
		System.out.println("国語の平均点：" + sub1/6);
		System.out.println("数学の平均点：" + sub2/6);
		in.close();
		
	}
}

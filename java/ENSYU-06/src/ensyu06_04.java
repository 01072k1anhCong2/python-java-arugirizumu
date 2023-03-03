import java.util.Scanner;
public class ensyu06_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("クラス数->");
		int classNum = in.nextInt();
		int capacity = 0;
		int totalMembers=0;
		int[] classSize = new int[classNum];
		for(int i=0; i<classNum; i++) {
			System.out.print("クラス"+(i+1)+"の人数->");
			int val = in.nextInt();
			totalMembers+=val;
			classSize[i]= val;
			
			if(val > capacity){ //最大人数求める
				capacity=classSize[i];
			}
		}
		int[][] grades = new int[classNum][capacity]; //成績点の配列
		
		for(int i=0; i<classNum; i++) {
			System.out.println("クラス"+(i+1));
			for(int j=0; j<classSize[i]; j++) {
				System.out.print("学生"+(j+1)+" 点数->");
				grades[i][j]=in.nextInt();
			}
		}
		int sumTotal =0;
		int avgTotal =0;
		
		for(int i=0; i<classNum; i++){
			int sumClass =0;
			int avgClass =0;
			for(int j=0; j<grades[i].length; j++){
				sumTotal+=grades[i][j];
				sumClass+=grades[i][j];
				
			}
			avgClass=sumClass/classSize[i];
			System.out.println((i+1)+"クラスの合計点："+sumClass);
			System.out.println((i+1)+"クラスの平均点："+avgClass);
		}
		avgTotal=sumTotal/totalMembers;
		System.out.println("全体の合計点："+sumTotal);
		System.out.println("全体の平均点："+avgTotal);
		
		in.close();
		
	}
}

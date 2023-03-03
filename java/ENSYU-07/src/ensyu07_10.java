import java.util.Scanner;

public class ensyu07_10 {
	//public static int ans;
	
	public static int printProblem(int X, int Y, int Z, int prob) {
		
		//int ans=0;
		switch(prob) {
		case 1:
			//X+Y+Z
			System.out.print(X+"+"+Y+"+"+Z);
			
			return X+Y+Z;
		case 2:
			//X+Y-Z
			System.out.print(X+"+"+Y+"-"+Z);
			
			return X+Y-Z;
		case 3:
			//X-Y+Z
			System.out.print(X+"-"+Y+"+"+Z);
			
			return X-Y+Z;
		case 4:
			//X-Y-Z
			System.out.print(X+"-"+Y+"-"+Z);
			
			return X-Y-Z;
		default:
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(true) {
			
		
		int X = (int)Math.floor(Math.random()*(999-100+1)+100);
		int Y = (int)Math.floor(Math.random()*(999-100+1)+100);
		int Z = (int)Math.floor(Math.random()*(999-100+1)+100);
		int prob = (int)Math.floor(Math.random()*(4-1+1)+1);
		
		int ans=printProblem(X,Y,Z, prob);
		System.out.print("=");
		int ansInp = in.nextInt();
		if (ans==ansInp) {
			System.out.println("正解！");
			break;
		} else {
			System.out.println("違いますよ！");
			ans=printProblem(X,Y,Z, prob);
			System.out.println("="+ans);
			if(ans!=ansInp) {
				System.out.print("もう一度トライ？ Yes=1/No=0 =>");
				int ansInp2 = in.nextInt();
				if (ansInp2==1) {
					continue;
				} else if(ansInp2==0) {
					break;
				} else {
					System.out.println("表示エラー");
				}
			}
			}
			in.close();
		}
	}
}


import java.util.Scanner;

public class ensyu04_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("何ｃｍから->");
		int height1 = in.nextInt();
		
		System.out.println("何ｃｍまで->");
		int height2 = in.nextInt();
		
		System.out.println("何ｃｍごと->");
		int interval = in.nextInt();
		in.close();
		
		if (height2<height1) {
			int temp=height2;
			height2=height1;
			height1=temp;
		}
		
		double standard = 0;
		System.out.println("身長	標準体重");
		for(double i=height1;i<=height2;i+=interval) {
			standard = (i/100)*(i/100)*22;
			System.out.println((int)i+"	    "+standard);
			
		}
	}
}

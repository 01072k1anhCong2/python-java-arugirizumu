import java.util.Scanner;

public class ensyu03_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値1を入力->");
		int a = in.nextInt();
		
		System.out.println("整数値2を入力->");
		int b = in.nextInt();

        System.out.println("整数値3を入力->");
		int c = in.nextInt();
	
        int temp = 0;

        if (a > b && a > c) {
            //Here you determine second biggest, but you know that a is largest
            temp = a;
            a=c;
            c=temp;
        }
        
        if (b > a && b > c) {
            //Here you determine second biggest, but you know that b is largest
            temp = b;
            b=c;
            c=temp;
        }   
        
        if (a>b){
            temp = a;
            a = b;
            b = temp;
        }

		System.out.println("変数Aは " + a + " です。");
		System.out.println("変数Bは " + b + " です。");
        System.out.println("変数Cは " + c + " です。");
	
		in.close();
	}
}

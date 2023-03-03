import java.util.Scanner;

public class ensyu07_02 {
    public static int min(int A, int B, int C) {
        int min = A;
        if (min>B){
            min = B;
        }
        if (min>C){
            min = C;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1変数を入力->");
        int A = in.nextInt();
        System.out.println("2変数を入力->");
        int B = in.nextInt();
        System.out.println("3変数を入力->");
        int C = in.nextInt();
        
        System.out.println("最小値："+ min(A,B,C));

        in.close();
    }
}

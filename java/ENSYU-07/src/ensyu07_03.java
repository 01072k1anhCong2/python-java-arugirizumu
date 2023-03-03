import java.util.Scanner;

public class ensyu07_03 {
    public static int med(int X, int Y, int Z){
        
        if ((X < Y && Y < Z) || (Z < Y && Y < X))
            return Y;
        if ((Y < X && X < Z) || (Z < X && X < Y))
        	return X;
        else
        	return Z;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1変数を入力->");
        int X = in.nextInt();
        System.out.println("2変数を入力->");
        int Y = in.nextInt();
        System.out.println("3変数を入力->");
        int Z = in.nextInt();
        
        System.out.println("中央値："+ med(X,Y,Z));
        in.close();
    }
}
import java.util.Scanner;

public class ensyu07_07 {
    static void putStars(int n){
        for(int i=n;i>0;i--){
            putChars('*',i);
        }
        
    }

    static void putChars(char C, int n){
        for (int i=0;i<n;i++){
            System.out.print(C);
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("整数を入力->");
        int n = in.nextInt(); 
        putStars(n);
        in.close();
    }
}

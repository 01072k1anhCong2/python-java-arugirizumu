import java.util.Scanner;

public class ensyu07_01 {
    public static int signof(int n){
        int result =0;
        if(n<0) {
            result = -1;
        } else if(n==0) {
            result = 0;
        } else if(n>0) {
            result = 1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("整数を入力->");
        int inpNum = in.nextInt();

        System.out.println(signof(inpNum));
        in.close();
    }
    
}

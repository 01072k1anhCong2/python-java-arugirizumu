import java.util.Scanner;

public class ensyu07_09 {
    public static int readplusInt(){
        Scanner in = new Scanner(System.in);
        System.out.print("正整数を入力->");
        int n = in.nextInt();
        while (n<=0){
            System.out.print("正整数を入力->");
            n = in.nextInt();
        }
        in.close();
        return n;
    }

    public static void main(String[] args){
        int n = readplusInt();
        int n2 = 0;
        while(n!=0){
            int lastNum=n%10;
            n2 = n2*10 + lastNum;
            n = n/10;
        }
        

        System.out.println("逆から表示すると"+n2+"です");
    }
}

import java.util.Scanner;


public class ensyu07_08 {
    public static int random(int n1, int n2){
    
        return (int)Math.floor(Math.random()*(n2-n1+1)+n1);
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("小さい整数を入力->");
        int A = in.nextInt();
        System.out.print("大きい整数を入力->");
        int B = in.nextInt();
        if(A>B){
            System.out.println("乱数表示できません");
        }else{
            System.out.println(random(A,B));
        }
        
        in.close();
    }
}

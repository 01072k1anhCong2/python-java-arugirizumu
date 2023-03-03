import java.util.Scanner;

public class ensyu08_09 {
    public static boolean addMatrix(int[][] TBLX, int[][] TBLY, int[][] TBLZ){
        if(TBLX.length==TBLY.length && TBLX[0].length==TBLY[0].length){
            for(int i = 0; i<TBLX.length; i++){
                for(int j = 0; j<TBLX[0].length; j++){
                    TBLZ[i][j] = TBLX[i][j] + TBLY[i][j];
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void printMatrix(int[][] TBL){
        System.out.println("TBLZ");
        for(int i = 0; i<TBL.length; i++){
            for(int j = 0; j<TBL[0].length; j++){
                System.out.print(TBL[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    //メイン
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean same = false;
        int[][] TBLX = { {1, 2, 3},
                         {4, 5, 6}
        };
        int[][] TBLY = { {6, 3, 4},
                         {5, 1, 2}
        };
        int[][] TBLZ = new int[TBLX.length][TBLX[0].length];

        same = addMatrix(TBLX, TBLY, TBLZ);

        if (same){
            printMatrix(TBLZ);
        } else {
            System.out.println("配列の要素数が等しくない");
        }
        in.close();
    }
}

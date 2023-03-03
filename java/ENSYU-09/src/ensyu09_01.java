import java.util.Scanner;
//クラス定義
class Person1{
	String name;
	int height;
	int weight;
	
	//コンストラクタ定義
	Person1(String n, int h, int w){
		this.name = n;
		this.height = h;
		this.weight = w;
	}
	//表示するメソッド
	void printmethod() {
		System.out.println("--");
		System.out.println("名前："+this.name);
		System.out.println("身長："+this.height);
		System.out.println("体重："+this.weight);
	}
}
//メイン
public class ensyu09_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("名前を入力->");
		String name = in.next();
		System.out.println("身長を入力->");
		int height = in.nextInt();
		System.out.println("体重を入力->");
		int weight = in.nextInt();
		Person1 a = new Person1(name,height,weight);
		
		System.out.println("名前を入力->");
		name = in.next();
		System.out.println("身長を入力->");
		height = in.nextInt();
		System.out.println("体重を入力->");
		weight = in.nextInt();
		Person1 b = new Person1(name,height,weight);
		
		a.printmethod();
		b.printmethod();
		
		in.close();
	}
}

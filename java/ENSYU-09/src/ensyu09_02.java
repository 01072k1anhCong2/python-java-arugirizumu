import java.math.BigDecimal;
import java.util.Scanner;

//クラス定義
class Person2{
	String name;
	double height;
	double weight;
	double bmi;
	double sw;
	
	//コンストラクタ定義
	Person2(String n, double h, double w){
		this.name = n;
		this.height = h;
		this.weight = w;
		this.bmi = 0;
		this.sw = 0;
	}
	//BMIメソッド
	void BMI() {
		double calc = this.weight / ( (this.height/100)*(this.height/100) ) ;
		this.bmi = BigDecimal.valueOf(calc).setScale(4, BigDecimal.ROUND_HALF_DOWN).doubleValue();
	}
	//標準体重メソッド
	void SW() {
		double calc = (double)(this.height/100)*(this.height/100)*22;
		this.sw = BigDecimal.valueOf(calc).setScale(4, BigDecimal.ROUND_HALF_DOWN).doubleValue();
	}
	
	//表示メソッド
	void printmethod() {
		System.out.println("--");
		System.out.println("名前："+this.name);
		System.out.println("身長："+this.height);
		System.out.println("体重："+this.weight);
		System.out.println("BMI："+this.bmi);
		System.out.println("標準体重："+this.sw);
	}
}
//メイン
public class ensyu09_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("名前を入力->");
		String name = in.next();
		System.out.println("身長を入力->");
		double height = in.nextDouble();
		System.out.println("体重を入力->");
		double weight = in.nextDouble();
		Person2 a = new Person2(name,height,weight);
		
		System.out.println("名前を入力->");
		name = in.next();
		System.out.println("身長を入力->");
		height = in.nextInt();
		System.out.println("体重を入力->");
		weight = in.nextInt();
		Person2 b = new Person2(name,height,weight);
		
		System.out.println("名前を入力->");
		name = in.next();
		System.out.println("身長を入力->");
		height = in.nextInt();
		System.out.println("体重を入力->");
		weight = in.nextInt();
		Person2 c = new Person2(name,height,weight);
		
		a.BMI();
		a.SW();
		a.printmethod();
		
		b.BMI();
		b.SW();
		b.printmethod();
		
		c.BMI();
		c.SW();
		c.printmethod();
		
		in.close();
	}
}

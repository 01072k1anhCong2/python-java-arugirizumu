import java.math.BigDecimal;
import java.util.Scanner;

//クラス定義
class Person4{
	String name;
	double height;
	double weight;
	double bmi;
	double sw;
	
	//コンストラクタ定義
	Person4(String n, double h, double w){
		this.name = n;
		this.height = h;
		this.weight = w;
		this.bmi = 0;
		this.sw = 0;
	}
	
	void BMI() {
		double calc = this.weight / ( (this.height/100)*(this.height/100) ) ;
		this.bmi = BigDecimal.valueOf(calc).setScale(4, BigDecimal.ROUND_HALF_DOWN).doubleValue();
	}
	
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

public class ensyu09_04 {
	//平均身長クラスメソッド
	static double avgHeight(Person4[] arr){
		double avg =0.0;
		for(int i=0; i<5;i++) {
			avg+=arr[i].height;
			System.out.println(avg);
			
		}
		avg=avg/5;
		return avg;
	}
	//平均体重クラスメソッド
	static double avgWeight(Person4[] arr){
		double avg = 0.0;
		for(int i=0; i<5;i++) {
			avg+=arr[i].weight;
			
		}
		avg=avg/5;
		return avg;
	}
	//メイン
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Person4[] arr = new Person4[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("名前を入力->");
			String name = in.next();
			System.out.println("身長を入力->");
			int height = in.nextInt();
			System.out.println("体重を入力->");
			int weight = in.nextInt();
			
			arr[i] = new Person4(name,height,weight);
		}
		
		for (int i=0; i<5; i++) {
			arr[i].BMI();
			arr[i].SW();
			arr[i].printmethod();
		}
		
		System.out.println("5人の平均体重："+avgWeight(arr));
		System.out.println("5人の平均身長："+avgHeight(arr));
		
		in.close();
	}
}

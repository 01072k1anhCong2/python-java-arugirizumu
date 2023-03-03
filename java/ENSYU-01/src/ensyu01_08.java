import java.util.Scanner;

public class ensyu01_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("三角形の底辺を入力->");
		double base = in.nextDouble();

		System.out.println("三角形の高さを入力->");
		double height = in.nextDouble();

		double area = (base*height)/2;

		System.out.println("三角形の面積は：" + area + "です。");

		in.close();
	}
}

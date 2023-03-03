import java.util.Scanner;

public class ensyu01_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("球の半径を入力->");
		double radius = in.nextDouble();
		double pi = 3.1416;
		double area = radius*radius*pi*4;
		
		double volume = (4/3)*pi*(radius*radius*radius);


		System.out.println("球の表面積は：" + area + "です。");
		System.out.println("球の体積は：" + volume + "です。");

		in.close();
	}
}

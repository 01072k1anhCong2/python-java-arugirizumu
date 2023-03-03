public class ensyu02_04 {
	public static void main(String[] args) {
		
		String a = "こんにちは";
		String b = "さようなら";
		
		System.out.println(a);
		System.out.println(b);
		
		String c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		

	}
}

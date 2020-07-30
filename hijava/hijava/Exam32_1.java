package hijava;
public class Exam32_1 {
	public static void main(String[] args) {
		int a=1, b=0, c;
		try {
			c = a/b;
		} catch(ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("예외 처리 끝");
		}
	}
}

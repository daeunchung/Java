import java.util.*;
public class Exam19_2 {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0; i<10; i++) {
			System.out.println(r.nextInt(500));
			//500이하의 난수가 발생
		}
		System.out.println(Math.abs(-5));
		System.out.println(Math.max(10,20));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(9));
	}
}

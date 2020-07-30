package step1;
/*
 * # ´çÃ·º¹±Ç[1´Ü°è] 33.33333333333%ÀÇ ´çÃ·È®·ü
 */
import java.util.Random;
public class Ex10_3Q {

	public static void main(String[] args) {
	Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		if(rNum < 3) {
			System.out.println("´çÃ·");
		}
		if(rNum >= 3) {
			System.out.println("²Î");
		}
	}
}

package step4;
import java.util.Scanner;
/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 또는 숫자로 이루어진 문자열을 입력하시오");
		System.out.print("입력 : ");
		String text = scan.next();
		
		int num = 0;
		int let = 0;
		int size = text.length();
		
		for(int i = 0; i<size; i++) {
			if(48 <= (int)text.charAt(i) && (int)text.charAt(i) <= 57) {
				//char가 각각 0123456789 일 때에 아스키값이 각각 48~57 인 점을 활용하여 
				num ++;
			}else {
				let++;
			}
		}
		
		if(num == 0) {
			System.out.println("문자만 있다");
		}else if(let == 0) {
			System.out.println("숫자만 있다");
		}else {
			System.out.println("문자와 숫자가 섞여있다");
		}
		
	}

}

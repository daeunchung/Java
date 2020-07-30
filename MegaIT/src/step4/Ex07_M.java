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
public class Ex07_M {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		
		// 각 숫자 한개를 문자로 가지로 있는 문자배열을 생성해줬음
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		
		// 매 자리마다 0 ~ 9 가 있는지 검사하는 코드		
		int cnt = 0; // 문자열 속 숫자 세어주는 변수
		for(int i = 0; i<charNum.length; i++) {
			for(int j = 0; j<text.length(); j++) {
				if(charNum[i] == text.charAt(j)) {
					cnt += 1;
				}
			}
		}
		
		if(cnt == text.length()) { // text문자열의 길이 만큼 숫자가 있다는 거니까 all 숫자 라는 뜻
			System.out.println("숫자만 있다");
		}else if(cnt == 0) {
			System.out.println("문자만 있다");
		}else {
			System.out.println("문자와 숫자가 섞여있다");
		}
	}

}


// Ctrl + a : 전체 스크롤 이었다니 !!!!!!!!!!!!!!!!!!!!!!!! 실수로 찾았다 대박
package step1;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

public class Ex07_3Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 수를 입력하시오");
		int num2 = scan.nextInt();
		System.out.println(num1 + "*" + num2 + "= ?");
		
		int ans = scan.nextInt();
		if(ans == num1*num2) {
			System.out.println("정답");
		}
		else
			System.out.println("땡");
		
	}
}


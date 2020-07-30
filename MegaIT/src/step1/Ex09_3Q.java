package step1;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

public class Ex09_3Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("세번째 수를 입력하세요");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) 
			System.out.println("가장 큰 수 = " + num1);
		if(num2>num1 && num2>num3) 
			System.out.println("가장 큰 수 = " + num2);
		if(num3>num1 && num3>num2) 
			System.out.println("가장 큰 수 = " + num3);
	}
}


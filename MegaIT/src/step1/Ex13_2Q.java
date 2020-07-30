package step1;
/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원
 * 4) 13,14 : 700원
 * 5) 15,16 : 750원
 * ... 
 */

import java.util.Random;
import java.util.Scanner;

public class Ex13_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("이용할 정거장 수를 입력하시오. 1~16 정거장 입력가능");
		int sNum = scan.nextInt();
		
		if(1 <= sNum && sNum <=5 ) {
			System.out.println("500원입니다");
		}
		if(6 <= sNum && sNum <=10 ) {
			System.out.println("600원입니다");
		}
		if(11 == sNum || sNum ==12 ) {
			System.out.println("650원입니다");
		}
		if(13 == sNum || sNum == 14 ) {
			System.out.println("700원입니다");
		}
		if(15 == sNum || sNum == 16 ) {
			System.out.println("750원입니다");
		}
		
	}

}

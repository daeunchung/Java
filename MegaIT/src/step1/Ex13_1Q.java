package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */
public class Ex13_1Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(50) + 1;
		int ten = num/10;
		int one = num%10;
		
		if(ten%3==0 && one%3 ==0) {
			System.out.println("짝짝");
		}
		else if(ten%3==0 && one%3 !=0) {
			System.out.println("짝");
		}
		else if(ten%3!=0 && one%3 ==0) {
			System.out.println("짝");
		}
		else {
			System.out.println(num);
		}
		System.out.println(num);
		
	}

}

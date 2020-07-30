package step1;
/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

import java.util.Random;
import java.util.Scanner;

public class Ex12_6Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num = ran.nextInt(101) + 150;
		
		System.out.println("랜덤 수의 가운데자리 수를 입력하시오");
		int mid = scan.nextInt();
		
		if( (num%100)/10 == mid ){
			System.out.println("정답입니다");
			System.out.println("랜덤 수는 " + num + "이었습니다");
		}else
			System.out.println("오답입니다");
			System.out.println("랜덤 수는 " + num + "이었습니다");
	}

}

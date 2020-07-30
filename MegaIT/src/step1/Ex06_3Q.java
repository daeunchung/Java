package step1;

import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */

public class Ex06_3Q {

	public static void main(String[] args) {
		System.out.println("0 1 2 중 하나의 수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		
		int com = 1;
		if(me>com ) {System.out.println("내가 이겼다");};
		if(me==com ) {System.out.println("비겼다");};
		if(me<com ) {System.out.println("내가 졌다");};
		
	}

}

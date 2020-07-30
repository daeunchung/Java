package step1;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

public class Ex06_2Q {

	public static void main(String[] args) {
		int com = 8;
		System.out.println("me 해당값을 입력하시오");
		Scanner scan = new Scanner(System.in);
		
		int me = scan.nextInt();
		if(me <com)
			System.out.println("Up!");
		if(me ==com)
			System.out.println("Bingo!");
		if(me >com)
			System.out.println("Down!");
	}

}

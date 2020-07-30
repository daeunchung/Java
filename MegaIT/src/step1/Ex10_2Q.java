package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class Ex10_2Q {

	public static void main(String[] args) {
		
	Random ran = new Random();
	int coin = ran.nextInt(2);
	System.out.println("동전의 앞뒷면을 맞추시오");
	System.out.println("앞면이면 0, 뒷면이면 1을 입력하시오");
	
	Scanner scan = new Scanner(System.in);
	int me = scan.nextInt();
	
	if(coin == me)
		System.out.println("정답입니다");
	else
		System.out.println("오답입니다");
	}

}

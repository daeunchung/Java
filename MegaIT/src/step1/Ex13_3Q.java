package step1;
/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */
import java.util.Random;
import java.util.Scanner;

public class Ex13_3Q {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int x = ran.nextInt(10) + 1;
	int y = ran.nextInt(10) + 1;
	
	int symbol = ran.nextInt(4) + 1;

	int z = 0;// 무슨값으로든 초기화 해야합니다
	if(symbol == 1) {
		z = x + y;
	}else if(symbol == 2) {
		z = x - y;
	}else if(symbol == 3) {
		z = x * y;
	}else if(symbol == 4) {
		z = x % y;
	}
	
	System.out.println(x + " ? " + y + " = " + z);
	System.out.println();
	System.out.println("1)+ 2)- 3)* 4)%");
	System.out.print(" ? 에 알맞은 기호의 번호를 입력하세요 : ");
	int ans = scan.nextInt();
	
	if(symbol == ans) {
		System.out.println("정답!");
	}else {
		System.out.println("오답!");
	}
	
	}
}

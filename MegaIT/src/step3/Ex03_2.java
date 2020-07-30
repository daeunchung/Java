package step3;
/*
 * # 숫자 야구 게임
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */

import java.util.Random;
import java.util.Scanner;

public class Ex03_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		
		while(true) {
			
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i<3; i++) {
				System.out.print("[" + (i+1) + "]1~9 입력 : ");
				int num = scan.nextInt();
				
				int check = 1;
				for(int j = 0; j<i; j++) {
					if(num == me[j]) {
						check = -1; // 비교해서 같으면 -1로 바꾸자
					}
				}
				
				if(check ==
						-1) {
					i -= 1; //이미 -1이면 i값 하나줄여
					
				}else {
					me[i] = num ;
				}
			}
		}
		
	}

}

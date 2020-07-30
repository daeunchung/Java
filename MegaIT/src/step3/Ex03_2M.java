package step3;

import java.util.Random;
import java.util.Scanner;

/*0510-
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
public class Ex03_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		
	
		while(true) {
		
			int strike = 0;
			int ball = 0;
	
			for(int i = 0; i < 3; i++) {
				System.out.print("[" + (i+1) + "]1~9입력 : ");
				int num = scan.nextInt();
			
				int check = 1;
				int j = 0;
				
				while(j < i) {
					if(me[j] == num) {
						check = -1;
					}j++; // while문을 쓰면 조건성립시에 j를 ++ 시켜주는 실행문을 직접 작성해주어야하고
				}
				
				if(check == 1) {
					me[i] = num;
					
				}else 
					i--; // for문을 쓰면 조건성립여부와 상관없이 자동으로 i++ 되므로 자동증가를 막아주기위해 i-- 필요
			}
			
			
			System.out.print("me = [");
			for(int i = 0; i<3; i++) {
				System.out.print(me[i] + " ");
			}System.out.println("]");
			
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							strike++;
						}else if(i != j) {
							ball++;
						}
					}
				}
			}
			System.out.print("Strike(" + strike + ") Ball(" + ball + ")");
			System.out.println();
			
		if(strike == 3) {
			break;
		}

		
		}

	}

}

package step3;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */
public class Ex04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		// 숫자 1~9는 front 배열에 저장하고, 숫자 10~18은 back 배열에 저장한다.
		for(int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = SIZE + (i+1);
		}
		
		// front[] & back[] 셔플
		// 배열원소값은 위에서 저장해줬고 배열index를 랜덤으로 받아서 쉐킷쉐킷
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(SIZE);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			r = ran.nextInt(SIZE);
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;	
		}
		
		int num = 1;
		while(true) {
			
			int answer = 0;
			for(int i = 0; i<SIZE; i++) {
				if(front[i] == num) {
					answer = i;
					// 플레이어한테 입력받기 전에 num의 실제 index 값을 answer에 저장
					}
			}
			System.out.println(num + "[" + answer + "]");
			// 표시된 숫자[인덱스값] 을 출력해주네... 왜 하는거
			
			for(int i = 0; i<SIZE; i++) {
				if(front[i] == 0) {
					// back[] 배열의 숫자도 다 했으면 공백 출력
					// 즉 그 자리에 숫자가 2개 출력되는게 끝났으면 공백 출력
					System.out.print("\t");
				}else {
					System.out.print(front[i] + "\t");
				}
				
				if(i % 3 == 2) {
					//System.out.println(); 한줄 띄기
					System.out.println("\n"); // 두줄 띄기
				}
			}
			System.out.print("[" + num + "]의 인덱스 입력 : ");
			int idx = scan.nextInt();
			
			// 1~9 놈들로 일치할수도 OR 10~19 놈들로 일치할수도 -> case 나눠
			if(front[idx] == num) { 
				if(1 <= num && num <= SIZE) {
					// 1~9놈들로 일치해서 그 자리에 뒷놈들을 넣어줘
					front[idx] = back[idx];
				}else {
					// 10~19놈들로 일치해서 더이상 넣어줄값 X -> 0을 넣어줘
					front[idx] = 0;
				}
				
				num += 1; // front[idx] == num 만족했으면 무조건 num증가
			}
			
			if(num == 19) {
				break;
			}			
			
		}

	}

}

package step3;
/*
 * # 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int charIdx = 0;
		int wallIdx1 = 0;
		int wallIdx2 = 0;		
		
		for(int i = 0; i<9; i++) {
			if(game[i] == 2) {
				charIdx = i;
			}
		}
				
		while(true) {
			
			for(int i=0; i<9; i++) {
				if(game[i] == 2) {
					System.out.print("옷 ");
				}else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
	
		System.out.println("좌(1)우(2) 입력 : ");
		int move = scan.nextInt();
		
		if(move == 1) {		
			if(charIdx >= 1) {
				
				if(game[charIdx-1] == 1) {
				System.out.print("벽이라서 이동불가능. 격파(3) 입력 : ");
				int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}
				game[charIdx - 1] = 2;
				game[charIdx] = 0;
				charIdx -= 1;
			}
	
		}
		
		else if(move == 2) {	
			if(charIdx <= 7) {
				
				if(game[charIdx+1] == 1) {
				System.out.print("벽이라서 이동불가능. 격파(3) 입력 : ");
				int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}
				game[charIdx + 1] = 2;
				game[charIdx] = 0;
				charIdx += 1;

			}
			
		}
	}
		
	}

}

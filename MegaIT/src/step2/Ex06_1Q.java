package step2;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */
public class Ex06_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		while(true) {
		
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
				System.out.print("옷 ");
			}else {
				System.out.print(game[i] + " ");
			}
			} System.out.println();

		
		
			
			System.out.print("숫자[1.왼쪽 2.오른쪽]로 이동을 입력하세요 : ");
			int num = scan.nextInt();

			if(num == 1) {
				if(player != 0) {
					game[player] = 0;
					game[player-1] = 2;
					player--;
			}
				else if(player == 0) 
					System.out.println("가장 왼쪽 끝에 도달하여 더이상 왼쪽으로 갈 수 없다.");
			}
			else if(num == 2) {
				if(player != 6) {
					game[player] = 0;
					game[player+1] = 2;
					player++;
				}
				else if(player == 6)
					System.out.println("가장 오른쪽 끝에 도달하여 더이상 오른쪽으로 갈 수 없다.");
			}
	
		}
		
	}

}

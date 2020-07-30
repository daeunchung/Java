package step4;
import java.util.Scanner;

/*
 * # 스네이크 게임
 * 1. 10x10 배열을 0으로 채운다.
 * 2. 스네이크는 1234로 표시한다.
 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
 * 4. 자기몸하고 부딪히면, 사망한다.
 * 5. 랜덤으로 아이템을 생성해
 *    아이템을 먹으면 꼬리 1개가 자란다.
 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
 */
public class Ex17_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 10;
		int[][] map = new int[SIZE][SIZE];
		
		int[] x = new int[4];
		int[] y = new int[4];
		int[] snake = new int[4];
		
		for(int i=0; i<4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
			snake[i] = map[y[i]][x[i]];
		}
		
		while(true) {
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = scan.nextInt();
			
			// 스네이크의 머리부분(1) 이 이동할 좌표 값을 나타내는 변수
			int yy = 0; 
			int xx = 0;
			
			if(sel == 1) {yy = y[0]; xx = x[0]-1;}
			else if(sel == 2) {yy = y[0]; xx = x[0]+1;}
			else if(sel == 3) {yy = y[0]-1; xx = x[0];}
			else if(sel == 4) {yy = y[0]+1; xx = x[0];}
			if(yy<0 || xx<0) {continue;}
			if(yy>=SIZE || xx>=SIZE) {continue;} // map 범위에서 벗어나면 컨디뉴
			if(map[yy][xx] != 0) {continue;} // 뱀몸통위로 떨어지면 컨디뉴
			
			// 화면 초기화
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					map[i][j] = 0;
				}
			}
			
			// 이동하기
			/*for(int i = 0; i<snake.length-1; i++) {
				y[i+1] = y[i];
				x[i+1] = x[i];
			} 같아보이지만 잘못된 코드 왜 틀린지 생각해보기 ! : 이미 바뀐 후의 값이 꼬리물고 들어가니까 ~ */
			
			for(int i=snake.length-1; i>0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}y[0] = yy; x[0] = xx;
		
			// 뱀 표시
			for(int i = 0; i<snake.length; i++) {
				map[y[i]][x[i]] = i+1;
			}
		}
	}

}

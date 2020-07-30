package step3;
import java.util.Random;

/*
 * # 당첨복권 1셋트
 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
 * 2. 랜덤으로 5개의 복권을 생성하되,
 *    당첨복권은 한 개만 생성되도록 설정한다.
 */
public class Ex12_1M{

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lottoSet = new int[5][7];

		int win = 0; // 당첨(333) 횟수
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<7; j++) {
				int r = ran.nextInt(2);
				if(r == 1) 
					lottoSet[i][j] = 3;
				else
					lottoSet[i][j] = 0;

			}
			int check = -1; // 당첨(333) 여부
			int cnt = 0; 
			for(int j = 0; j<7; j++) {
				if(lottoSet[i][j] == 3) {
					cnt++;
				}else {
					cnt = 0;
				}
				if(cnt == 3) {
					check = 1;
				}
			}
			
			if(check == 1 && win == 1) { // 당첨됐는데 또 당첨 -> 이번 복권 다시 받도록 
				i--;
			}else if(check == 1 && win == 0) { // 이번에 처음 당첨
				win = 1;
			}else if(check == -1 && win == 0) { // 당첨된적 X 이번에도 안됌
				i--;
			} //else if(check == -1 && win == 1) // 당첨된적 있는데 이번에 당첨 안됐으면 그대로 i++; for문 반복문 타면됌
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}

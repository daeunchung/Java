// 다시한번 풀어봐
// 강사님처럼 간단한 코드로 !!
package step2;
import java.util.Scanner;
/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 아래 3종류의 복권의 당첨여부를 출력한다.
 */
public class Ex04_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                     // 0  1  2  3  4  5  6  7
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};

		boolean run = true;
		while(run) {
			
			int cnt = 0;
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 6; i++) {
					if( lotto1[i] == 7 && lotto1[i+1] == 7 && lotto1[i+2] == 7) {
						cnt++;
					}
				}
				if(cnt != 0 ) {
					System.out.println("[1]번복권 : 당첨입니다 ! ");
				}else
					System.out.println("[1]번복권 : 당첨이 아닙니다.");
				
			}
			else if(sel == 2) {
				
				for(int i = 0; i < 6; i++) {
					if( lotto2[i] == 7 && lotto2[i+1] == 7 && lotto2[i+2] == 7) {
						cnt++;
					}
				}
				if(cnt != 0 ) {
					System.out.println("[2]번복권 : 당첨입니다 ! ");
				}else
					System.out.println("[2]번복권 : 당첨이 아닙니다.");
				
			}
			else if(sel == 3) {
				
				for(int i = 0; i < 6; i++) {
					if( lotto3[i] == 7 && lotto3[i+1] == 7 && lotto3[i+2] == 7) {
						cnt++;
					}
				}
				if(cnt != 0 ) {
					System.out.println("[3]번복권 : 당첨입니다 ! ");
				}else
					System.out.println("[3]번복권 : 당첨이 아닙니다.");
				
			}
			
		}
	}

}
/*
 				for(int i=0; i<8; i++) {
					if(lotto1[i] == 7) {
						cnt += 1;
						if(cnt == 3) {
							check = 1;
						}
					}else {
						cnt = 0;
					}
				}  cnt를  세고 연달아 3번 나오면 check값을 변경
*/



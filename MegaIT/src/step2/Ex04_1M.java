//2020-02-19 12:15-12:29
package step2;
import java.util.Scanner;
/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 아래 3종류의 복권의 당첨여부를 출력한다.
 */

public class Ex04_1M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {
			
			
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			
			if(sel == 1) {
				int check = -1;
				int cnt = 0;
				for(int i = 0; i < 8; i++) {
					if(lotto1[i] == 7 ) {
						cnt++;
						if(cnt ==3) {
							check = 1;
						}
					}else {
						cnt = 0;
					}
				}
				if(check == 1) {
					System.out.println("당첨!");
				}else {System.out.println("꽝");}
			
				}
			
		
			 if(sel == 2) {
				int check = -1;
				int cnt = 0;
				for(int i = 0; i < 8; i++) {
					if(lotto2[i] == 7 ) {
						cnt++;
						if(cnt ==3) {
							check = 1;
						}
					}else
						cnt = 0;
				}
				if(check == 1) {
					System.out.println("당첨!");
				}else {System.out.println("꽝");}
			
				}
			
	
			else if(sel == 3) {
				int check = -1;
				int cnt = 0;
				for(int i = 0; i < 8; i++) {
					if(lotto3[i] == 7 ) {
						cnt++;
						if(cnt ==3) {
							check = 1;
						}
					}else
						cnt = 0;
				}
				if(check == 1) {
					System.out.println("당첨!");
				}else {System.out.println("꽝");}
			
				}
		}
	}

}

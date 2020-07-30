package step2;

import java.util.Scanner;
/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */
public class Ex03_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int[] seat = new int[7];
		
		for(int i = 0; i < 7; i++) {
			seat[i] = 0;
		}
		
		boolean run = true;
		
		while(run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.print("좌석선택 : ");
				int idx = scan.nextInt();
				
				if(seat[idx] == 1) {
					System.out.print("seat = ");
					
					for(int i = 0; i < 7; i++) {
						System.out.print(seat[i] + " ");
						}
					
					System.out.println();
					System.out.println("이미 예매가 완료된 자리입니다. ");
				}
				else if (seat[idx] == 0) {
					seat[idx] = 1;
					cnt ++;
					System.out.print("seat = ");
					
					for(int i = 0; i < 7; i++) {
						System.out.print(seat[i] + " ");
					}
					System.out.println();
				}
			}
			
			else if(sel == 2) {
				run = false;
				System.out.println("-----------------------");
				System.out.println("매출액 : " + cnt * 12000 + "원");
			}
		}
	}
}

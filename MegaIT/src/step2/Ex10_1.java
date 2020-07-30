package step2;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */

public class Ex10_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			for(int i = 0; i<cnt; i++) {
				System.out.println((i+1) + ". " + accs[i] + " : " + pws[i]);
			}System.out.println();
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(cnt == 5) {
					System.out.println("더 이상 가입할 수 없습니다");
					continue; // (처음가서 다시 메뉴 출력해야하니까 꼭 써야하고)
				}
				
				System.out.print("[가입]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
								
				// int check 이용해서 새 계좌가 기존 계좌랑 중복되는지 확인해주기
				int check = 1;
				for(int i = 0; i<cnt; i++) {
					if(myAcc == accs[i]) {
						check = -1;
					}
				}
				
				if(check == -1) {
					System.out.println("계좌번호가 중복됩니다.");
				}else {
					accs[cnt] = myAcc;
					System.out.print("[가입]비밀번호 입력 : ");
					int myPw = scan.nextInt();
					
					pws[cnt] = myPw;
					cnt++;
				}
				
			}
			else if(sel == 2) {
				System.out.print("[탈퇴]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
				
				int check = -1;
				for(int i = 0; i<cnt; i++) {
					if(myAcc == accs[i]) {
						check = i;
					}
				}
				
				if(check == -1) {
					System.out.println("해당 계좌번호가 존재하지 않습니다.");
					//continue; (써도 되고 안써도 되고)
				}else {
					for(int i = check; i<cnt; i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
					}
					cnt--;
				}
				
			}
			
		}
		
	}
}

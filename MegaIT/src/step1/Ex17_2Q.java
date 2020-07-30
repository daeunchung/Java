package step1;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */
public class Ex17_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.println("입금할 계좌를 입력하시오");
				int scanAcc = scan.nextInt();
				if( scanAcc == myAcc ) {

					System.out.println("입금할 금액을 입력하시오");
					int sendMoney = scan.nextInt();
					System.out.println("입금이 완료되었습니다");
					myMoney += sendMoney;	
					System.out.println();
					}
				else 
					System.out.println("계좌번호가 잘못되었습니다");
					System.out.println();
			
			}
			
			else if(sel == 2) {
				
				System.out.println("출금할 계좌를 입력하시오");
				int scanAcc = scan.nextInt();
				if( scanAcc == myAcc ) {
					
					System.out.println("출금할 금액을 입력하시오");
					int sendMoney = scan.nextInt();
					
					if(sendMoney <= myMoney) {
						System.out.println("출금이 완료되었습니다");
						myMoney -= sendMoney;	
						System.out.println();
						
					}else if(sendMoney > myMoney) {
						System.out.println("잔액이 부족하여 출금이 불가능합니다");
						System.out.println("나의 계좌 잔액은 " + myMoney );
						System.out.println();
						}
					}
				else 
					System.out.println("계좌번호가 잘못되었습니다");
					System.out.println();
				
			}
			
			else if(sel == 3) {
				System.out.println("이체할 계좌를 입력하시오");
				int scanAcc = scan.nextInt();
				if( scanAcc == yourAcc ) {
					
					System.out.println("이체할 금액을 입력하시오");
					int sendMoney = scan.nextInt();
					
					if(sendMoney <= myMoney) {
						System.out.println("이체가 완료되었습니다");
						myMoney -= sendMoney;
						yourMoney += sendMoney;
						System.out.println();
					
					}else if(sendMoney > myMoney) {
						System.out.println("잔액이 부족하여 이체 불가능합니다");
						System.out.println("나의 계좌 잔액은 " + myMoney );
						System.out.println();
					
					}
					
				}
				else
					System.out.println("이체할 계좌를 확인해주세요");
			}
			
			else if(sel == 4) {
				
				System.out.println("나의 계좌의 잔액은 " + myMoney );
				System.out.println("상대방의 계좌의 잔액은 " + yourMoney );
				System.out.println();
			}
			
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}

	}

}

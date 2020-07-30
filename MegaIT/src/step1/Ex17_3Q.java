package step1;
/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 0. 종료
 */

import java.util.Scanner;

public class Ex17_3Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(log == -1) {
					System.out.println("계좌번호를 입력하시오");
					int inAcc = scan.nextInt();
					
					if(inAcc == dbAcc1) {
						System.out.println("비밀번호를 입력하시오 ");
						int inPw = scan.nextInt();
						
						if(inPw == dbPw1) {
							System.out.println("로그인 되었습니다. ");
							System.out.println();
							log = 1;
						}else { 
							System.out.println("비밀번호가 잘못되었습니다");
							System.out.println();
							}
					}
					
					else if(inAcc == dbAcc2) {
						System.out.println("비밀번호를 입력하시오 ");
						int inPw = scan.nextInt();
						
						if(inPw == dbPw2) {
							System.out.println("로그인 되었습니다. ");
							System.out.println();
							log = 2;
						}else { 
							System.out.println("비밀번호가 잘못되었습니다"); 
							System.out.println();
						}
					}	
					
					else
						System.out.println("계좌번호가 잘못되었습니다.");
						System.out.println();
				}
				
				else if(log == 1) {
					System.out.println("이미 로그인 되어있습니다. 로그아웃 먼저 해주세요");
					System.out.println();
				}
				else if(log == 2) {
					System.out.println("이미 로그인 되어있습니다. 로그아웃 먼저 해주세요");
					System.out.println();
				}
			}
			
			
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("로그인 후에 로그아웃이 가능합니다");
				}
				else if(log == 1) {
					System.out.println("로그아웃 되었습니다");
					log = -1;
				}
				else if(log == 2) {
					System.out.println("로그아웃 되었습니다");
					log = -1;
				}

			}
			
			
			
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("로그인 후에 이용해주세요 ");
				}
				else if(log == 1) {
					System.out.println("입금할 금액을 입력하시오");
					int inMoney = scan.nextInt(); 
					
					dbMoney1 += inMoney;
					System.out.println("입금이 완료되었습니다");
				}
				else if(log == 2) {
					System.out.println("입금할 금액을 입력하시오");
					int inMoney = scan.nextInt(); 
					
					dbMoney2 += inMoney;
					System.out.println("입금이 완료되었습니다");
				}
			}
			
			
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인 후에 이용해주세요 ");
				}
				if(log == 1) {
					System.out.println("출금할 금액을 입력하시오");
					int outMoney = scan.nextInt();
					
					if(outMoney > dbMoney1) {
						System.out.println("귀하의 계좌에 잔액이 부족합니다");
					}else {
						dbMoney1 -= outMoney;
						System.out.println("출금이 완료되었습니다 ");
					}
				}
				if(log == 2) {
					System.out.println("출금할 금액을 입력하시오");
					int outMoney = scan.nextInt();
					
					if(outMoney > dbMoney2) {
						System.out.println("귀하의 계좌에 잔액이 부족합니다");
					}else {
						dbMoney2 -= outMoney;
						System.out.println("출금이 완료되었습니다 ");
					}
					
				}
			}
			
			
			else if(sel == 5) {
				
				if(log == -1) {
					System.out.println("로그인 후에 이용해주세요 ");
				}
				if(log == 1) {
					System.out.println("이체할 계좌를 입력해주세요 ");
					int sendAcc = scan.nextInt();
					
					if(sendAcc == dbAcc2) {
						System.out.println("이체할 금액을 입력하시오 ");
						int sendMoney = scan.nextInt();
						
						if(sendMoney > dbMoney1) {
							System.out.println("귀하의 계좌에 잔액이 부족합니다 ");
						}else {
							dbMoney1 -= sendMoney;
							dbMoney2 += sendMoney;
							System.out.println("이체가 완료 되었습니다 ");
							System.out.println();
						}
					}else
						System.out.println("이체할 계좌번호를 확인해주세요");
						
					
				}
				if(log == 2) {
					System.out.println("이체할 계좌를 입력해주세요 ");
					int sendAcc = scan.nextInt();
					
					if(sendAcc == dbAcc1) {
						System.out.println("이체할 금액을 입력하시오 ");
						int sendMoney = scan.nextInt();
						
						if(sendMoney > dbMoney2) {
							System.out.println("귀하의 계좌에 잔액이 부족합니다 ");
						}else {
							dbMoney2 -= sendMoney;
							dbMoney1 += sendMoney;
							System.out.println("이체가 완료 되었습니다");
							System.out.println();
						}
					}else
						System.out.println("이체할 계좌번호를 확인해주세요");
				}
			}
			
			
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("로그인 후에 이용해주세요 ");
				}
				if(log == 1) {
					System.out.println("계좌의 잔액은 : " + dbMoney1 + "원 입니다 ");
				}
				if(log == 2) {
					System.out.println("계좌의 잔액은 : " + dbMoney2 + "원 입니다 ");
				}
			}
			
			
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}

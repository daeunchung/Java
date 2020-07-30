package step1;
import java.util.Scanner;
/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */			
public class Ex17_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if( log == -1 ) {
					System.out.println("계좌번호를 입력해주세요");
					int myAcc = scan.nextInt();
					
					if(myAcc == dbAcc1) {
						System.out.println("비밀번호를 입력해주세요");
						int myPw = scan.nextInt();
						
						if(myPw == dbPw1) {
							System.out.println("1번 계정으로 로그인 되었습니다");
							System.out.println();
							log = 1;
							//run = false; -> 치면 다음 선택문이 출력되지 않아요. (주석 3군데 다)
						}else
							System.out.println("비밀번호를 확인해주세요");
					
						
					}else if(myAcc == dbAcc2) {
						System.out.println("비밀번호를 입력해주세요");
						int myPw = scan.nextInt();
						
						if(myPw == dbPw2) {
							System.out.println("2번 계정으로 로그인 되었습니다");
							log = 2;
							//run = false;
							System.out.println();
							
						}else
							System.out.println("비밀번호를 확인해주세요");
							System.out.println();

					}else 
						System.out.println("계좌번호가 잘못되었습니다");
						System.out.println();
					
					
				}else if( log == 1 || log == 2) {
					System.out.println("이미 로그인 되어있습니다");
					System.out.println("재 로그인이 불가합니다");
					System.out.println();
					}
			}
			
			else if(sel == 2) {
				
				if(log == -1) {
					System.out.println("로그인 후에만 로그아웃이 가능합니다");
					System.out.println();
				}else if(log == 1 || log ==2 ) {
					System.out.println("로그아웃 되었습니다");
					log = -1;
					//run = false;
					System.out.println();
				}
			}
			
				
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}

package step1;

import java.util.Scanner;

public class Ex12_5 {

	public static void main(String[] args) {
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		// 2. 종료
		int cash = 20000; // 입금시 감소, 출금시 증가
		int balance = 30000; // 입금시 증가, 출금시 감수 //balance잔고 잔액
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용
		
		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int select = scan.nextInt();
		
		if(select ==1) {
			System.out.println("계좌와 비밀번호를 입력하세요");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			if(acc == account && pw == password){
				System.out.println("1.입금 2.출금 3.조회");
				select = scan.nextInt();
				
				if(select ==1) {
					System.out.println("입금할 금액을 입력하세요");
					int deposit = scan.nextInt();
					cash -= deposit;
					balance += deposit;
					System.out.println("입금완료 되었습니다");
				}
				else if (select ==2) {
					System.out.println("출금할 금액을 입력하세요");
					int withdraw = scan.nextInt();
					cash += withdraw;
					balance -= withdraw;
					System.out.println("출금완료 되었습니다");
				}
				
				System.out.println("잔액 : " + balance + "원");
			}
			
			else {
				System.out.println("아이디와 패스워드를 확인해주세요");
			}	
		}
		else if(select == 2) {
			System.out.println("종료");
		}
	}
}

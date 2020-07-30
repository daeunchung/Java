package step1;
/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

import java.util.Scanner;

public class Ex12_4Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("이체할 계좌번호를 입력하시오");
		int inAcc = scan.nextInt();
		
		if(inAcc == yourAcc) {
			System.out.println("이체할 금액을 입력하시오");
			int sendMoney = scan.nextInt();
			
			if (sendMoney <= myMoney) {
				System.out.println(sendMoney + "원이 이체되었습니다");
				myMoney -= sendMoney;
				yourMoney += sendMoney;
				System.out.println("이체를 완료하였습니다.");
			}
			else if(sendMoney > myMoney) {
				System.out.println("잔액이 부족하여 이체가 불가능합니다.");
			}
			
		}else
			System.out.println("계좌번호가 일치하지 않습니다.");
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	}

}

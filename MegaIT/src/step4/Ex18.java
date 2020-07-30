package step4;

import java.util.Scanner;

//식권 자판기 프로그램 		
//1) 관리자   2) 사용자 
//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
//      2)뒤로가기
//조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
//화면 
//식권 가격 : 3200원 
//식권 	  : ??매  (매진시 매진) 
//50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
//1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] money  = {50000, 10000, 5000, 1000, 500, 100}; // 출력용
		int[] charge = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		int run = 1;
		
		while(run == 1) {
			
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 관리자
			if(sel == 1) {
				int run1 = 1;
				while(run1 == 1) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int sel1 = scan.nextInt();
					if(sel1 == 1) {
						System.out.println("[현재 : " + tickets + "장] 충전할 식권 수 입력 : ");
						int count = scan.nextInt();
						tickets += count;
						System.out.println(tickets + "만큼 식권을 충전합니다.");
					}
					else if(sel1 == 2) {
						int run2 = 1;
						while(run2 == 1) {
							for(int i = 0; i<money.length; i++) {
								System.out.print("[" + i + ". " + money[i] + "원");
							}
							System.out.println();
							System.out.println("6.뒤로가기");
							int sel2 = scan.nextInt();
							if(sel2 == 6) {
								run2 = 0;
							}else {
								charge[sel2] += 1;
								System.out.println(money[sel2] + "을 충전합니다.");
							}
						}
					}
					else if(sel1 == 3) {
						run1 = 0;
					}
				}
			}
			
			// 사용자
			else if(sel == 2) {
				int run1 = 1;
				while(run1 == 1) {
					System.out.println("식권 가격 : " + price + "원");
					System.out.println("식권 매수 : " + tickets + "매");
					for(int i = 0; i<money.length; i++) {
						System.out.print("[" + money[i] + "원] ");
						System.out.print(charge[i] + "매");
						System.out.println();
					}
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int sel3 = scan.nextInt();
					if(sel3 == 1) {
						System.out.print("입금할 금액 입력 : ");
						int input_count[] = new int[6];
						int input_money = 0;
						
						// while문 한번 돌때마다 한장 입금 가능하게 짜논 코드인듯
						while(true) { 
							System.out.println("[1.오만원] [2.일만원] [3.오천원] [4.일천원] [5.오백원] [6.일백원] [0.종료]");
							int num = scan.nextInt();
							if(num == 0) break;
							else input_count[num-1] ++;
							
							input_money = 0;
							for(int i = 0; i<6; i++) {
								input_money += input_count[i] * money[i];
							}System.out.println("입금한 금액 : " + input_money);
						}
						if(input_money < price) break; // 입금액이 식권한장값도 안되면 돈 더받아
						System.out.print("식권 매수 입력 : ");
						int ticket_count = scan.nextInt();
						if(tickets < ticket_count) break;
						int price_total = ticket_count * price;
						int result = input_money - price_total;
						if(result < 0) {
							System.out.println("입금한 금액이 적습니다.");
						}else {
							// 잔돈 거슬러 주는 과정
							// 체크(temp)배열 만들어서 내용 옮기주기
							int check_charge[] = new int[6];
							for(int i = 0; i<6; i++) {
								check_charge[i] = charge[i];
							}
							int result_check = result;
							for(int i = 0; i<6; i++) {
								int check_run = 1;
								while(check_run == 1) {
									// if(잔돈 >= 단위지폐금액 && 해당지폐잔여장수 > 0){ 
									// check_잔돈 -= 단위지폐금액;
									// check 배열에서 잔돈으로 나간 지폐 한장 빼주기}
									if(result_check >= money[i] && check_charge[i] > 0) {
										result_check -= money[i];
										check_charge[i] --;
									}else {
										check_run = 0; break;
									}
								}
							}
							// 잔돈이랑 입금액이랑 일치하면 
							// check배열에 옮겨놨던거 원위치 + 입금액도 잔돈배열로 넣어줘
							if(result_check == 0) {
								for(int i = 0; i<6; i++) {
									charge[i] = check_charge[i];
									charge[i] += input_count[i];
								}
								tickets -= ticket_count/*구매식권장수*/;
								
								System.out.println(
										"[입금 : " + input_money + "]" + 
										"[총액 : " + price_total + "]" + 
										"[거스름돈 : " + result + "]");	
							}else {
							System.out.println("잔돈이 부족합니다.");}
						}
					}
					else if(sel3 == 2) {
						run1 = 0;
					}
				}
			}
		}
	}
}

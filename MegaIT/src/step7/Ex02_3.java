package step7;

import java.util.Scanner;

class Ticket{
	boolean check;
	// check가 true면 이미 예매완료좌석 (꽉찬네모) false면 아직 빈좌석(빈네모)
	void showData() {
		if(check == true) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
}
public class Ex02_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;	
		Ticket [] tickets = new Ticket[8]; // 방 8개 파주고
		for(int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket(); // 제일많이 실수.
		} // 8개에 모두 Ticket 클래스 부여
		
		while(true) {
			
			for(int i = 0; i<tickets.length; i++) {
				tickets[i].showData();
			}
			System.out.println();
			
			int cnt = 0;
			for(int i=0; i<tickets.length; i++) {
				if(tickets[i].check) {
					cnt++;
				}
			}
			if(cnt == 8) {
				System.out.println("죄송합니다. 만석입니다.");
				break;
			}
			
			System.out.println("번호 입력 : ");
			int sel = scan.nextInt();
			if(tickets[sel].check == false) {
				tickets[sel].check = true;				
			}else if(tickets[sel].check == true) {
				System.out.println("이미 예매된 좌석입니다. ");
			}
		}
	}
}
